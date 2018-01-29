package com.chinacaring.peixian.patient.client.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.chinacaring.common.exception.CommonException;
import com.chinacaring.peixian.patient.client.config.Constant;
import com.chinacaring.peixian.patient.client.dao.entity.CommonUsedPatient;
import com.chinacaring.peixian.patient.client.dao.repository.CommonUsedPatientRepository;
import com.chinacaring.peixian.patient.client.dto.front.request.CommonUsedPatientRequest;
import com.chinacaring.peixian.patient.client.dto.front.response.BindCommonUsedPatientResponse;
import com.chinacaring.peixian.patient.client.dto.front.response.CommonUsedPatientResponse;
import com.chinacaring.peixian.patient.client.dto.his2.CreateProfileRequestHis;
import com.chinacaring.peixian.patient.client.service.BaseInfoService;
import com.chinacaring.peixian.patient.client.service.CommonUsedPatientService;
import com.chinacaring.peixian.patient.client.wsdl.reponse.insert_patientinfo.InsertPatientInfo;
import com.chinacaring.peixian.patient.client.wsdl.reponse.patient_cardno.PatientCardNo1;
import com.chinacaring.peixian.patient.client.wsdl.request.QuyiServiceNo;
import com.chinacaring.peixian.patient.client.wsdl.request.QuyiServiceNoSoap;
import com.chinacaring.user.dao.entity.User;
import com.chinacaring.user.dao.entity.UserInfo;
import com.chinacaring.user.dao.service.IUserInfoService;
import com.chinacaring.util.BeanMapperUtil;
import com.chinacaring.util.IdCardUtil;
import com.chinacaring.util.PhoneUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.util.List;

@Service
public class CommonUsedPatientServiceImpl implements CommonUsedPatientService {

    private final CommonUsedPatientRepository commonUsedPatientRepository;

    private final IUserInfoService iUserInfoService;

    private final IdCardUtil idCardUtil;

    private final BaseInfoService baseInfoService;

    @Autowired
    public CommonUsedPatientServiceImpl(CommonUsedPatientRepository commonUsedPatientRepository, IUserInfoService iUserInfoService, IdCardUtil idCardUtil, BaseInfoService baseInfoService) {
        this.commonUsedPatientRepository = commonUsedPatientRepository;
        this.iUserInfoService = iUserInfoService;
        this.idCardUtil = idCardUtil;
        this.baseInfoService = baseInfoService;
    }

    @Override
    public BindCommonUsedPatientResponse bindCommonUsedPatient(CommonUsedPatientRequest commonUsedPatientRequest, User user) throws CommonException, ParseException {

        String phone = commonUsedPatientRequest.getPhone();
        //身份证大写
        String idCard = commonUsedPatientRequest.getIdCard().toUpperCase();
        commonUsedPatientRequest.setIdCard(idCard);

        if (!PhoneUtils.isPhoneLegal(phone)){
            throw new CommonException("电话号码格式有误");
        }
        if (!idCardUtil.isValidatedAllIdcard(idCard)){
            throw new CommonException("身份证格式有误");
        }

        List<CommonUsedPatient> commonUsedPatients = commonUsedPatientRepository.findAllByIdCardAndUserId(idCard, user.getId());

        //避免重复绑定
        if (commonUsedPatients.size() > 0){
            CommonUsedPatient commonUsedPatient = commonUsedPatients.get(0);
            Integer state = commonUsedPatient.getState();
            if (Constant.STATE_COMMON_USED_PATIENT_IN_USE.equals(state)){
                throw new CommonException("身份证号已绑定过");
            } else if (Constant.STATE_COMMON_USED_PATIENT_DELETED.equals(state)){
                //之前已删除 想重新绑定
                commonUsedPatient.setState(Constant.STATE_COMMON_USED_PATIENT_IN_USE);
                commonUsedPatientRepository.save(commonUsedPatient);
                return BeanMapperUtil.map(commonUsedPatient, BindCommonUsedPatientResponse.class);
            }

        }

        CommonUsedPatient commonUsedPatient = BeanMapperUtil.map(commonUsedPatientRequest, CommonUsedPatient.class);
        commonUsedPatient.setUserId(user.getId());
        //设置 state为 1  正在使用
        commonUsedPatient.setState(Constant.STATE_COMMON_USED_PATIENT_IN_USE);

        //需查询门诊档案获取 cardNo
        //没有则 创建门诊档案
        //都失败 则 设置patient_code 为 “” 并且  设置提醒信息
        //获取patient_code
        String patientCode = "";
        String message = "";
        String mcardNo = "";
        //名族
        String ethnic = commonUsedPatientRequest.getEthnic();
        String name = commonUsedPatientRequest.getName();

        try {

            PatientCardNo1 existProfile = baseInfoService.getExistProfile(idCard, name);
            patientCode = existProfile.getCARDNO();
            mcardNo = existProfile.getCARDNO();
            //如果查询成功但是为空 则 还需要 重新建档
            if (StringUtils.isEmpty(patientCode)){
                throw new CommonException("查到档案，但是patientCode为 空");
            }
        } catch (CommonException e) {
            message = e.getDetailMessage();
            CreateProfileRequestHis createProfileRequestHis = new CreateProfileRequestHis();
            createProfileRequestHis.setPhone(phone);
            createProfileRequestHis.setName(name);
            createProfileRequestHis.setIdCard(idCard);

            //报 异常 则无法获取此人的 patientNo 则 直接 抛出异常
            InsertPatientInfo profileResponseHis = baseInfoService.createProfile(createProfileRequestHis);
            patientCode = profileResponseHis.getCARDNO();
            mcardNo = profileResponseHis.getCARDNO();
        }

        commonUsedPatient.setMcardNo(mcardNo);
        commonUsedPatient.setPatientCode(patientCode);
        commonUsedPatient.setMessage(message);
        commonUsedPatients = commonUsedPatientRepository.findAllByIdCardAndUserId(idCard, user.getId());
        //避免重复绑定
        if (commonUsedPatients.size() > 0){
            commonUsedPatient = commonUsedPatients.get(0);
            Integer state = commonUsedPatient.getState();
            if (Constant.STATE_COMMON_USED_PATIENT_IN_USE.equals(state)){
                throw new CommonException("身份证号已绑定过");
            } else if (Constant.STATE_COMMON_USED_PATIENT_DELETED.equals(state)){
                //之前已删除 想重新绑定
                commonUsedPatient.setState(Constant.STATE_COMMON_USED_PATIENT_IN_USE);
                commonUsedPatientRepository.save(commonUsedPatient);
                return BeanMapperUtil.map(commonUsedPatient, BindCommonUsedPatientResponse.class);
            }
        } else {
            commonUsedPatientRepository.save(commonUsedPatient);
        }

        //如果 常用就诊人是 自己  就将信息 写入 userinfo
        if (idCard.equals(user.getIdCard())){
            UserInfo userInfo = new UserInfo();
            userInfo.setPatientCode(patientCode);
            iUserInfoService.update(userInfo, (new EntityWrapper<UserInfo>()).eq("user_id", user.getId()));
        }
        return BeanMapperUtil.map(commonUsedPatient, BindCommonUsedPatientResponse.class);
    }

    @Override
    public boolean deleteCommonUsedPatient(String idCard, User user) throws CommonException {

        CommonUsedPatient commonUsedPatient = commonUsedPatientRepository.findByIdCardAndUserId(idCard, user.getId());

        if (null == commonUsedPatient){
            throw new CommonException("无此用户信息");
        }

        //设置 state 为 2  已删除
        commonUsedPatient.setState(Constant.STATE_COMMON_USED_PATIENT_DELETED);
        commonUsedPatientRepository.save(commonUsedPatient);

        return true;
    }

    @Override
    public List<CommonUsedPatientResponse> getCommonUsedPatient(User user) throws CommonException {

        List<CommonUsedPatient> commonUsedPatients = commonUsedPatientRepository.findAllByUserIdAndState(user.getId(), Constant.STATE_COMMON_USED_PATIENT_IN_USE);
        return BeanMapperUtil.mapList(commonUsedPatients, CommonUsedPatientResponse.class);
    }

    @Override
    public boolean modifyPhone(CommonUsedPatientRequest commonUsedPatientRequest, User user) throws CommonException {

        if (!PhoneUtils.isPhoneLegal(commonUsedPatientRequest.getPhone())){
            throw new CommonException("手机号格式不正确");
        }
        CommonUsedPatient commonUsedPatient = commonUsedPatientRepository.findByIdCardAndUserIdAndState(commonUsedPatientRequest.getIdCard(), user.getId(), Constant.STATE_COMMON_USED_PATIENT_IN_USE);
        commonUsedPatient.setPhone(commonUsedPatientRequest.getPhone());

        commonUsedPatientRepository.save(commonUsedPatient);
        return true;
    }

}

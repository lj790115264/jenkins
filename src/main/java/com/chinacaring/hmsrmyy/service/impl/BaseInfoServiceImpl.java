package com.chinacaring.hmsrmyy.service.impl;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.hmsrmyy.config.Constant;
import com.chinacaring.hmsrmyy.config.InterfaceName;
import com.chinacaring.hmsrmyy.dao.entity.Dept;
import com.chinacaring.hmsrmyy.dao.repository.DeptRepository;
import com.chinacaring.hmsrmyy.dto.front.response.DeptResponse;
import com.chinacaring.hmsrmyy.dto.his.request.createProfile.CreateProfileRequestHis;
import com.chinacaring.hmsrmyy.dto.his.request.deptInfo.DeptInfoRequestHis;
import com.chinacaring.hmsrmyy.dto.his.request.getExistProfile.GetExistProfileRequestHis;
import com.chinacaring.hmsrmyy.dto.his.response.createProfile.CreateProfileResponseHis;
import com.chinacaring.hmsrmyy.dto.his.response.deptInfo.DeptInfoResponseHis;
import com.chinacaring.hmsrmyy.dto.his.response.getExistProfile.GetExistProfileResponseHis;
import com.chinacaring.hmsrmyy.service.BaseInfoService;
import com.chinacaring.hmsrmyy.utils.RequestUtil;
import com.chinacaring.util.BeanMapperUtil;
import com.chinacaring.util.JaxbXmlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BaseInfoServiceImpl implements BaseInfoService{

    @Autowired
    private DeptRepository deptRepository;

    @Override
    public GetExistProfileResponseHis getExistProfile(String idCard) throws CommonException {

        GetExistProfileRequestHis getExistProfileRequest = new GetExistProfileRequestHis();
        getExistProfileRequest.setIcno(idCard);
        String soap = RequestUtil.soap(InterfaceName.getExistProfile.name(), JaxbXmlUtil.convertToXml(getExistProfileRequest));
        GetExistProfileResponseHis getExistProfileResponse = JaxbXmlUtil.convertToJavaBean(soap, GetExistProfileResponseHis.class);

        if (!Objects.equals("1", getExistProfileResponse.getReturnCode())){
            throw new CommonException("暂无相关信息");
        }

        return getExistProfileResponse;
    }

    @Override
    public CreateProfileResponseHis createProfile(CreateProfileRequestHis createProfileRequestHis) throws CommonException {

        String soap = RequestUtil.soap(InterfaceName.createProfile.name(), JaxbXmlUtil.convertToXml(createProfileRequestHis));
        CreateProfileResponseHis createProfileResponseHis = JaxbXmlUtil.convertToJavaBean(soap, CreateProfileResponseHis.class);
        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, createProfileResponseHis.getReturnCode())){
            throw new CommonException(createProfileResponseHis.getReturnDesc());
        }
        return createProfileResponseHis;
    }

    @Override
    public Object insertDepts() throws CommonException {
        DeptInfoRequestHis deptInfoRequestHis = new DeptInfoRequestHis();
        deptInfoRequestHis.setDeptCode(Constant.ALL);
        String soap = RequestUtil.soap(InterfaceName.deptInfo.name(), JaxbXmlUtil.convertToXml(deptInfoRequestHis));
        DeptInfoResponseHis deptInfoResponseHis = JaxbXmlUtil.convertToJavaBean(soap, DeptInfoResponseHis.class);

        if (!Objects.equals(Constant.RETURN_CODE_SUCCESS, deptInfoResponseHis.getReturnCode())){
            throw new CommonException("暂无相关信息");
        }

        List<Dept> depts = BeanMapperUtil.mapList(deptInfoResponseHis.getItems().getData(), Dept.class);
        deptRepository.save(depts);
        return "ok";
    }

    @Override
    public Object getDepts() {
        List<Dept> depts = deptRepository.findByRegFlag(Constant.REG_FLAG_SHI_GUA_HAO_KE_SHI);
        return BeanMapperUtil.mapList(depts, DeptResponse.class);
    }


}


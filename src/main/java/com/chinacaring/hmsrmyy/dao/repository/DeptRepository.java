package com.chinacaring.hmsrmyy.dao.repository;

import com.chinacaring.hmsrmyy.dao.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface DeptRepository extends JpaRepository<Dept, Integer>{

    List<Dept> findByRegFlag(String regFlag);
}

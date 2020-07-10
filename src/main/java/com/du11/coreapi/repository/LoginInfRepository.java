package com.du11.coreapi.repository;

import com.du11.coreapi.entity.LoginInf;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginInfRepository {

    @Mapper
    LoginInf findByEmpno(@Param("empno") String empno);
}

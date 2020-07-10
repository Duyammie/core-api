package com.du11.coreapi.repository;

import com.du11.coreapi.entity.SRUser;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SRUserRepository {

    @Mapper
    SRUser findByEmpno(@Param("empno") String empno);

    @Mapper
    List<SRUser> findAll();


}

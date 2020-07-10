package com.du11.coreapi.repository;

import com.du11.coreapi.entity.UserRoleRight;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SRUserRoleRightRepository {

    @Mapper
    UserRoleRight findByEmpno(@Param("empno") String empno);
}

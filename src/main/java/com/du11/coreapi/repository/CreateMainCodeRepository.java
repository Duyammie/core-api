package com.du11.coreapi.repository;

import com.du11.coreapi.entity.Code;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.dialect.identity.Chache71IdentityColumnSupport;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateMainCodeRepository {

    @Mapper
    int createMainCode(@Param("code") Code code);

    @Mapper
    Code findMainCodeById(@Param("id") String id);
}

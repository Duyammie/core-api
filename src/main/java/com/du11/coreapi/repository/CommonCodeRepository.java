package com.du11.coreapi.repository;

import com.du11.coreapi.entity.Code;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonCodeRepository {

    @Mapper
    List<Code> findMainCode();

    @Mapper
    Code findMainCodeById(@Param("id") String id);

}

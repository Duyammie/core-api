package com.du11.coreapi.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.du11.coreapi.entity.Right;

import java.util.List;

@Repository
public interface RightRepsitory {

    @Mapper
    List<Right> findAll();

    @Mapper
    List<Right> findByRightId(@Param("rightId") String rightId);
}

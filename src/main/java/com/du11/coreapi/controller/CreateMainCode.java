package com.du11.coreapi.controller;

import com.du11.coreapi.dto.request.MainCodeRequest;
import com.du11.coreapi.dto.response.MainCodeResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/codes")
public class CreateMainCode {

    private  com.du11.coreapi.service.CreateMainCode createMainCodeService;


    @Autowired
    public CreateMainCode(com.du11.coreapi.service.CreateMainCode createMainCodeService) {
        this.createMainCodeService = createMainCodeService;
    }

    @PostMapping("/main")
    public ResponseEntity<MainCodeResponse> createMainCode(@RequestBody @Valid MainCodeRequest mainCodeRequest){
        MainCodeResponse mainCodeResponse = createMainCodeService.createMainCode(mainCodeRequest);
        return new ResponseEntity<>(mainCodeResponse, HttpStatus.CREATED);
    }

}

package com.du11.coreapi.controller;

import com.du11.coreapi.dto.response.SelectBoxResponse;
import com.du11.coreapi.service.CommonCodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/codes")
@Slf4j
public class CommonCodeController {

    private final CommonCodeService commonCodeService;

    @Autowired
    public CommonCodeController(CommonCodeService commonCodeService) {
        this.commonCodeService = commonCodeService;
    }

    @GetMapping("/selectbox")
    public ResponseEntity<List<SelectBoxResponse>> getAllMainCodeOnSelectbox() {
        return new ResponseEntity<>(commonCodeService.getMainCodeForSelectbox(), HttpStatus.OK);
    }
}

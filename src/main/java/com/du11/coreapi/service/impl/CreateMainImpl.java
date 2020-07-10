package com.du11.coreapi.service.impl;

import com.du11.coreapi.dto.request.MainCodeRequest;
import com.du11.coreapi.dto.response.MainCodeResponse;
import com.du11.coreapi.dto.response.UserDTO;
import com.du11.coreapi.entity.Code;
import com.du11.coreapi.entity.CodeKey;
import com.du11.coreapi.repository.CreateMainCodeRepository;
import com.du11.coreapi.service.CreateMainCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateMainImpl implements CreateMainCode {

    @Autowired
    private CreateMainCodeRepository createMainCodeRepository;

    @Override
    public MainCodeResponse createMainCode(MainCodeRequest mainCodeRequest) {

        Code code = new Code();
        CodeKey key = new CodeKey();
        key.setCdId(mainCodeRequest.getCode());
        key.setDtlCdId(mainCodeRequest.getCode());
        code.setKey(key);
        code.setDtlCdNm(mainCodeRequest.getName());
        code.setDlDt(mainCodeRequest.getExpDate());

        createMainCodeRepository.createMainCode(code);
        Code newCode = createMainCodeRepository.findMainCodeById(mainCodeRequest.getCode());
        return MainCodeResponse.builder()
                .cdId(newCode.getKey().getCdId())
                .dtlCdId(newCode.getKey().getDtlCdId())
                .name(newCode.getDtlCdNm())
                .expDate(newCode.getDlDt())
                .build();

    }

}

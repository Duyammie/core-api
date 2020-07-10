package com.du11.coreapi.service.impl;

import com.du11.coreapi.dto.response.SelectBoxResponse;
import com.du11.coreapi.repository.CommonCodeRepository;
import com.du11.coreapi.service.CommonCodeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@AllArgsConstructor
public class CommonCodeServiceImpl implements CommonCodeService {

    private final CommonCodeRepository commonCodeRepository;

    @Override
    public List<SelectBoxResponse> getMainCodeForSelectbox() {
        return commonCodeRepository.findMainCode().stream().map(
                code -> new SelectBoxResponse(code.getKey().getCdId(), code.getDtlCdNm())
        ).collect(Collectors.toList());
    }
}

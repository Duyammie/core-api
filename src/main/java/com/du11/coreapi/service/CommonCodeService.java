package com.du11.coreapi.service;

import com.du11.coreapi.dto.response.SelectBoxResponse;

import java.util.List;

public interface CommonCodeService {

    List<SelectBoxResponse> getMainCodeForSelectbox();
}

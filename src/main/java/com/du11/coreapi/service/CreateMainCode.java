package com.du11.coreapi.service;

import com.du11.coreapi.dto.request.MainCodeRequest;
import com.du11.coreapi.dto.response.MainCodeResponse;
import com.du11.coreapi.dto.response.UserDTO;

import java.util.List;

public interface  CreateMainCode {
    MainCodeResponse createMainCode (MainCodeRequest mainCodeRequest);
}

package com.du11.coreapi.dto.error;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiError {

    private int status = 400;
    private String statusMessage;
    private String timestamp;
    private List<ApiErrorDetail> errors;

}

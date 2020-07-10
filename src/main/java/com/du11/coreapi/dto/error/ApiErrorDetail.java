package com.du11.coreapi.dto.error;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiErrorDetail implements Serializable {

    private String code;
    private String fieldName;
    private String message;

}

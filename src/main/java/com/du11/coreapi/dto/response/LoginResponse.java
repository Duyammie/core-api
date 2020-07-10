package com.du11.coreapi.dto.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginResponse {

    private String id;
    private String name;
    private String token;
    private List<String> roles;
    private List<String> rights;
}

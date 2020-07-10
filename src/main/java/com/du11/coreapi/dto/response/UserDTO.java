package com.du11.coreapi.dto.response;

import lombok.*;
import org.springframework.data.annotation.CreatedBy;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {

    private String empno;

    @CreatedBy
    private String createdBy;
    public String getCreatedBy() {
        return createdBy;
    }

}

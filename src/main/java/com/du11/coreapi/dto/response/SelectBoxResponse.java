package com.du11.coreapi.dto.response;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SelectBoxResponse implements Serializable {

    private String id;
    private String text;
}

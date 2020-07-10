package com.du11.coreapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleRightKey implements Serializable {


    @Column(name = "RLE_ID")
    private String rleId;

    @Column(name = "RGH_ID")
    private String rghId;

    @Column(name = "APU_STRTDT")
    private String apyStrtDt;
}

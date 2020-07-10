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
public class UserRoleRightKey implements Serializable {

    @Column(name = "EMPNO")
    private String empno;

    @Column(name = "DV_C")
    private String dvc;

    @Column(name = "RLE_RHG_ID")
    private String rleRghId;

    @Column(name = "APY_STRTDT")
    private String apyStrtDt;
}

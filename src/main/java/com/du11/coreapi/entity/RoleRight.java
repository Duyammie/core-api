package com.du11.coreapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "srmg_emp_rle")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleRight extends Audit implements Serializable {

    @EmbeddedId
    private RoleRightKey key;

    @Column(name = "APY_ENDDT")
    private String apyEndDt;

    @Column(name = "RLE_NM")
    private String rleNm;
}

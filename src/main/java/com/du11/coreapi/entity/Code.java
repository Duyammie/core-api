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

@Table(name = "rcbz_code_dtl_info")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Code implements Serializable {

    @EmbeddedId
    private CodeKey key;

    @Column(name = "DTL_CD_NM")
    private String dtlCdNm;

    @Column(name = "RGR_ENO")
    private String rgrEno;

    @Column(name = "RG_DT")
    private String rgDt;

    @Column(name = "DL_DT")
    private String dlDt;
}

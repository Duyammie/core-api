package com.du11.coreapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CodeKey implements Serializable {

    @Column(name = "CD_ID")
    private String cdId;

    @Column(name = "DTL_CD_ID")
    private String dtlCdId;
}

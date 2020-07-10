package com.du11.coreapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "srmg_emp_rgh")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Right extends Audit implements Serializable {

    @Id
    @Column(name = "RGH_ID")
    private String rghId;

    @Column(name = "RGH_NM")
    private String rghNm;

    @Column(name = "VL_YN")
    private String vlYn;
}

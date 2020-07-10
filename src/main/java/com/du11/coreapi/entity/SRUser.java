package com.du11.coreapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sr_dev_emp_bas")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SRUser {

    @Id
    @Column(name = "EMPNO")
    private String empno;

    @Column(name = "FNM")
    private String fnm;

    @Column(name = "GRP")
    private String grp;

    @Column(name = "MNGR_RGH_YN")
    private String mngrRghYn;

    @Column(name = "DL_YN")
    private String dlYn;
}

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

@Table(name = "srmg_login_inf")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginInf extends Audit implements Serializable {

    @Id
    @Column(name = "EMPNO")
    private String empno;

    @Column(name = "PW")
    private String pw;
}

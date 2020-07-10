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

@Table(name = "srmg_emp_rle_rgh_bas")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleRight extends Audit implements Serializable {

    @EmbeddedId
    private UserRoleRightKey key;

    @Column(name = "APY_ENDDT")
    private String apyEndDt;
}

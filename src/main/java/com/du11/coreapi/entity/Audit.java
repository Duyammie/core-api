package com.du11.coreapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Audit implements Serializable {

    @Column(name = "SYS_FST_RG_TS")
    private LocalDateTime sysFstRgTs;

    @Column(name = "SYS_FST_RG_USID")
    private String sysFstRgUsid;

    @Column(name = "SYS_LT_CH_TS")
    private LocalDateTime sysLtChTs;

    @Column(name = "SYS_LT_CH_USID")
    private String sysLtChUsid;
}

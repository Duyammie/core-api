package com.du11.coreapi.common;

import com.du11.coreapi.entity.SRUser;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.io.Serializable;
import java.util.Collection;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class SRUserDetail extends User implements Serializable {

    private String id;
    private String companyName;

    public SRUserDetail(String username, String password, String companyName,
                        Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.id = username;
        this.companyName = companyName;
    }

    public static SRUserDetail create(SRUser user) {
        return null;
    }
}

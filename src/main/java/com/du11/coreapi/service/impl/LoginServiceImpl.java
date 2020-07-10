package com.du11.coreapi.service.impl;

import com.du11.coreapi.common.SRTransactionReadOnly;
import com.du11.coreapi.common.SRUserDetail;
import com.du11.coreapi.entity.LoginInf;
import com.du11.coreapi.entity.SRUser;
import com.du11.coreapi.repository.LoginInfRepository;
import com.du11.coreapi.repository.SRUserRepository;
import com.du11.coreapi.security.JwtTokenProvider;
import lombok.AllArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LoginServiceImpl implements UserDetailsService {

    private final LoginInfRepository loginInfRepository;
    private final SRUserRepository srUserRepository;
    private final JwtTokenProvider jwtTokenProvider;

    @Override
    @SRTransactionReadOnly
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {

        Optional<LoginInf> loginInf = Optional.ofNullable(loginInfRepository.findByEmpno(id));
        if (!loginInf.isPresent()) {
            throw new UsernameNotFoundException("Id does not exist.");
        }
        Optional<SRUser> srUser = Optional.ofNullable(srUserRepository.findByEmpno(id));
        if (!srUser.isPresent()) {
            throw new UsernameNotFoundException("User does not exist.");
        }

        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        SRUserDetail srUserDetail = new SRUserDetail(loginInf.get().getEmpno(),
                loginInf.get().getPw(),
                "",
                authorities);
        return srUserDetail;
    }
}

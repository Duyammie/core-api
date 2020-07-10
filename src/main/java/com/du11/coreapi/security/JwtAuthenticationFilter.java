package com.du11.coreapi.security;

import com.du11.coreapi.common.SRUserDetail;
import com.du11.coreapi.service.impl.LoginServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@Component
@AllArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtTokenProvider tokenProvider;
    private final ObjectMapper objectMapper;
    private final LoginServiceImpl loginService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        try {
            String jwt = tokenProvider.resolveToken(request);
            if (jwt != null && !"null".equals(jwt) && StringUtils.hasText(jwt) && tokenProvider.validateToken(jwt) ) {
                String id = tokenProvider.getSubjectFromToken(jwt);
                SRUserDetail srUserDetail = (SRUserDetail) loginService.loadUserByUsername(id);
                //TODO: Define roles rights of user
                List<GrantedAuthority> authorities = Stream.of("Super User", "Manager").map(
                        SimpleGrantedAuthority::new
                ).collect(Collectors.toList());
                /*SRUserDetail userPrincipal = new SRUserDetail(id,
                        "",
                        jwt,
                        authorities);*/
//                Object principal;
//                Object credentials;
                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                        srUserDetail, null, authorities);
                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authentication);
            } else {

            }
        } catch (Exception e) {
            log.error("Could not set user authentication in security context", e);
        }

        filterChain.doFilter(request, response);

    }
}

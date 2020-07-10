package com.du11.coreapi.service.impl;

import com.du11.coreapi.dto.response.UserDTO;
import com.du11.coreapi.service.SRUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.du11.coreapi.repository.SRUserRepository;
import com.du11.coreapi.entity.SRUser;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class SRUserServiceImpl implements SRUserService {

    private final SRUserRepository srUserRepository;

    //@Override
    public List<UserDTO> getAllUsers() {
        List<UserDTO> userDTOs = new ArrayList<>();
        List<SRUser> srUsers = srUserRepository.findAll();
        for (SRUser srUser : srUsers) {
            userDTOs.add(UserDTO.builder()
                    .empno(srUser.getEmpno())
                    .build());
        }
        return userDTOs;
    }
}

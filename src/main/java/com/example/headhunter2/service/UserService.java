package com.example.headhunter2.service;

import com.example.headhunter2.dto.user.UserCreateDTO;
import com.example.headhunter2.dto.user.UserDTOWithRoles;

import java.util.Set;

public interface UserService {
    Set<UserDTOWithRoles> getAllUsers();
    UserDTOWithRoles getUser(Integer id);

    UserDTOWithRoles createUser(UserCreateDTO createDTO);

    UserDTOWithRoles updateUser(UserCreateDTO createDTO, Integer id);

    void deleteUser(Integer id);
}

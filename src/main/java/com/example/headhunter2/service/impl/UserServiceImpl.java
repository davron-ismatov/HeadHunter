package com.example.headhunter2.service.impl;

import com.example.headhunter2.dto.user.UserCreateDTO;
import com.example.headhunter2.dto.user.UserDTOWithRoles;
import com.example.headhunter2.entities.Role;
import com.example.headhunter2.entities.Users;
import com.example.headhunter2.mapper.role.RoleWithoutPermissionMapper;
import com.example.headhunter2.mapper.user.UserCreateMapper;
import com.example.headhunter2.mapper.user.UserWithRolesMapper;
import com.example.headhunter2.repository.UserRepository;
import com.example.headhunter2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final UserCreateMapper createMapper;
    private final UserWithRolesMapper withRolesMapper;
    private final RoleWithoutPermissionMapper withoutPermissionMapper;
    @Override
    public Set<UserDTOWithRoles> getAllUsers() {
        return withRolesMapper.toDTOs(new HashSet<>(repository.findAll()));
    }

    @Override
    public UserDTOWithRoles getUser(Integer id) {
        return withRolesMapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public UserDTOWithRoles createUser(UserCreateDTO createDTO) {
        if(!repository.existsById(createDTO.getRole().getId())){
            throw new NullPointerException();
        }
        return   withRolesMapper.toDTO(repository.save(createMapper.toEntity(createDTO)));
    }

    @Override
    public UserDTOWithRoles updateUser(UserCreateDTO createDTO, Integer id) {
        Users users = repository.getReferenceById(id);
        users.setPassword(createDTO.getPassword());
        users.setUsername(createDTO.getUsername());
        users.setRole(withoutPermissionMapper.toEntity(createDTO.getRole()));
        return withRolesMapper.toDTO(repository.save(users));
    }

    @Override
    public void deleteUser(Integer id) {
        repository.deleteById(id);
    }
}

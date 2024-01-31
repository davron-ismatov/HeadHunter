package com.example.headhunter2.service.impl;

import com.example.headhunter2.dto.permission.PermissionCreateDTO;
import com.example.headhunter2.dto.permission.PermissionDTOWithRoles;
import com.example.headhunter2.dto.permission.PermissionDTOWithoutRoles;
import com.example.headhunter2.entities.Permission;
import com.example.headhunter2.entities.Role;
import com.example.headhunter2.mapper.permission.PermissionCreateMapper;
import com.example.headhunter2.mapper.permission.PermissionWithRoles;
import com.example.headhunter2.mapper.permission.PermissionWithoutRoles;
import com.example.headhunter2.mapper.role.RoleWithoutPermissionMapper;
import com.example.headhunter2.repository.PermissionRepository;
import com.example.headhunter2.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PermissionServiceImpl implements PermissionService {
    private final PermissionRepository repository;
    private final PermissionCreateMapper createMapper;
    private final PermissionWithoutRoles withoutRoles;
    private final PermissionWithRoles withRoles;
    private final RoleWithoutPermissionMapper roleWithoutPermissionMapper;
    @Override
    public Set<PermissionDTOWithRoles> getAllPermissions() {

        return  withRoles.toDTOs(new HashSet<>(repository.findAll()))
                .stream()
                .map(withRoles -> this.getPermission(withRoles.getId()))
                .collect(Collectors.toSet());

    }

    @Override
    public PermissionDTOWithRoles getPermission(Integer id) {
        Set<Role> roles = repository.getPermissionRoles(id);
        PermissionDTOWithRoles dto = withRoles.toDTO(repository.getReferenceById(id));
        dto.setRoleDTOWithoutPermissions(roleWithoutPermissionMapper.toDTOs(roles));
        return dto;
    }

    @Override
    public PermissionDTOWithoutRoles createPermission(PermissionCreateDTO createDTO) {
        return withoutRoles.toDTO(repository.save(createMapper.toEntity(createDTO)));
    }

    @Override
    public PermissionDTOWithRoles updatePermission(PermissionCreateDTO createDTO, Integer id) {
        Permission permission = repository.getReferenceById(id);
        permission.setPermission_name(createDTO.getPermission_name());
        return withRoles.toDTO(repository.save(permission));
    }

    @Override
    public void deletePermission(Integer id) {
            repository.deleteById(id);
    }
}

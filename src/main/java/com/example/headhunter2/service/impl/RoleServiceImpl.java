package com.example.headhunter2.service.impl;

import com.example.headhunter2.dto.role.RoleCreateDTO;
import com.example.headhunter2.dto.role.RoleDTOWithPermissions;
import com.example.headhunter2.entities.Permission;
import com.example.headhunter2.entities.Role;
import com.example.headhunter2.mapper.permission.PermissionWithoutRoles;
import com.example.headhunter2.mapper.role.RoleCreateMapper;
import com.example.headhunter2.mapper.role.RoleWithPermissionMapper;
import com.example.headhunter2.repository.RoleRepository;
import com.example.headhunter2.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository repository;
    private final RoleCreateMapper createMapper;
    private final RoleWithPermissionMapper withPermissionMapper;
    private final PermissionWithoutRoles withoutRoles;
    @Override
    public Set<RoleDTOWithPermissions> getAllRoles() {
        return withPermissionMapper.toDTOs(new HashSet<>(repository.findAll()));
    }

    @Override
    public RoleDTOWithPermissions getRole(Integer id) {
        return withPermissionMapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public RoleDTOWithPermissions createRole(RoleCreateDTO createDTO) {
        return withPermissionMapper.toDTO(repository.save(createMapper.toEntity(createDTO)));
    }

    @Override
    public RoleDTOWithPermissions updateRole(RoleCreateDTO createDTO, Integer id) {
        Role role = repository.getReferenceById(id);
        role.setRole_name(createDTO.getRole_name());
        role.setPermissions(withoutRoles.toEntities(createDTO.getPermissions()));

        return withPermissionMapper.toDTO(repository.save(role));
    }

    @Override
    public void deleteRole(Integer id) {
        repository.deleteById(id);
    }
}

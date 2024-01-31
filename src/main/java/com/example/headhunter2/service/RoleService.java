package com.example.headhunter2.service;

import com.example.headhunter2.dto.role.RoleCreateDTO;
import com.example.headhunter2.dto.role.RoleDTOWithPermissions;

import java.util.Set;

public interface RoleService {
    Set<RoleDTOWithPermissions> getAllRoles();

    RoleDTOWithPermissions getRole(Integer id);

    RoleDTOWithPermissions createRole(RoleCreateDTO createDTO);

    RoleDTOWithPermissions updateRole(RoleCreateDTO createDTO,Integer id);

    void deleteRole(Integer id);
}

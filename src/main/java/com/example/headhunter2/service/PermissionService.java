package com.example.headhunter2.service;

import com.example.headhunter2.dto.permission.PermissionCreateDTO;
import com.example.headhunter2.dto.permission.PermissionDTOWithRoles;
import com.example.headhunter2.dto.permission.PermissionDTOWithoutRoles;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface PermissionService {
    Set<PermissionDTOWithRoles> getAllPermissions();

    PermissionDTOWithRoles getPermission(Integer id);

    PermissionDTOWithoutRoles createPermission(PermissionCreateDTO createDTO);

    PermissionDTOWithRoles updatePermission(PermissionCreateDTO createDTO,Integer id);

    void deletePermission(Integer id);
}

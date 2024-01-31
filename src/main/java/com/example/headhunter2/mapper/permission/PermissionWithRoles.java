package com.example.headhunter2.mapper.permission;

import com.example.headhunter2.dto.permission.PermissionDTOWithRoles;
import com.example.headhunter2.entities.Permission;
import com.example.headhunter2.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionWithRoles extends EntityMapper<PermissionDTOWithRoles, Permission> {
}

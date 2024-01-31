package com.example.headhunter2.mapper.permission;

import com.example.headhunter2.dto.permission.PermissionDTOWithoutRoles;
import com.example.headhunter2.entities.Permission;
import com.example.headhunter2.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionWithoutRoles extends EntityMapper<PermissionDTOWithoutRoles, Permission> {
}

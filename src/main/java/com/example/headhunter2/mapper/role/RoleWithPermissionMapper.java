package com.example.headhunter2.mapper.role;

import com.example.headhunter2.dto.role.RoleDTOWithPermissions;
import com.example.headhunter2.entities.Role;
import com.example.headhunter2.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleWithPermissionMapper extends EntityMapper<RoleDTOWithPermissions, Role> {
}

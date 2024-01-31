package com.example.headhunter2.mapper.permission;

import com.example.headhunter2.dto.permission.PermissionCreateDTO;
import com.example.headhunter2.entities.Permission;
import com.example.headhunter2.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionCreateMapper extends EntityMapper<PermissionCreateDTO, Permission> {
}

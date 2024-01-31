package com.example.headhunter2.mapper.user;

import com.example.headhunter2.dto.role.RoleDTOWithoutPermission;
import com.example.headhunter2.dto.user.UserCreateDTO;
import com.example.headhunter2.entities.Users;
import com.example.headhunter2.mapper.EntityMapper;
import com.example.headhunter2.mapper.role.RoleWithoutPermissionMapper;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface UserCreateMapper extends EntityMapper<UserCreateDTO, Users> {







}

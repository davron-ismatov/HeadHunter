package com.example.headhunter2.mapper.user;

import com.example.headhunter2.dto.user.UserDTOWithoutRoles;
import com.example.headhunter2.entities.Users;
import com.example.headhunter2.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserWithoutRolesMapper extends EntityMapper<UserDTOWithoutRoles, Users> {
}

package com.example.headhunter2.dto.role;

import com.example.headhunter2.dto.permission.PermissionDTOWithoutRoles;
import com.example.headhunter2.dto.user.UserDTOWithoutRoles;
import lombok.*;

import java.util.Set;

//@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleDTOWithPermissions {
    private Integer id;
    private String role_name;
    private Set<UserDTOWithoutRoles> users;
    private Set<PermissionDTOWithoutRoles> permissions;

}

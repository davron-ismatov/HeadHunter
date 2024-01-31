package com.example.headhunter2.dto.role;

import com.example.headhunter2.dto.permission.PermissionDTOWithoutRoles;
import lombok.*;

import java.util.Set;

//@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleCreateDTO {
    private String role_name;
    private Set<PermissionDTOWithoutRoles> permissions;
}

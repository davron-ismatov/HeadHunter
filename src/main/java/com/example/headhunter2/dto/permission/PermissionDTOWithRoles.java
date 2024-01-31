package com.example.headhunter2.dto.permission;

import com.example.headhunter2.dto.role.RoleDTOWithoutPermission;
import lombok.*;

import java.util.Set;

//@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PermissionDTOWithRoles {
    private Integer id;
    private String permission_name;
    private Set<RoleDTOWithoutPermission> roleDTOWithoutPermissions;
}

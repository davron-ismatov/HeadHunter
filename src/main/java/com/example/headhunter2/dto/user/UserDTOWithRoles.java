package com.example.headhunter2.dto.user;

import com.example.headhunter2.dto.role.RoleDTOWithoutPermission;
import lombok.*;

import java.util.Set;

//@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTOWithRoles {
    private Integer id;
    private String username;
    private String password;
    private RoleDTOWithoutPermission role;
}

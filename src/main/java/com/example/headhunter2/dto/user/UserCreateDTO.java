package com.example.headhunter2.dto.user;

import com.example.headhunter2.dto.role.RoleDTOWithoutPermission;
import lombok.*;

//@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateDTO {
    private String username;
    private String password;
    private RoleDTOWithoutPermission role;


}

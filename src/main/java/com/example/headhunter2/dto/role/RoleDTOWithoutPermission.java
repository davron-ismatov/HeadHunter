package com.example.headhunter2.dto.role;

import lombok.*;

//@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleDTOWithoutPermission {
    private Integer id;
    private String role_name;
}

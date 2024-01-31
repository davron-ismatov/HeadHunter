package com.example.headhunter2.dto.permission;

import lombok.*;

//@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PermissionDTOWithoutRoles {
    private Integer id;
    private String permission_name;

}

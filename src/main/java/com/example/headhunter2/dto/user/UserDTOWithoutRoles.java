package com.example.headhunter2.dto.user;


import lombok.*;

//@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTOWithoutRoles {
    private Integer id;
    private String username;
    private String password;

}

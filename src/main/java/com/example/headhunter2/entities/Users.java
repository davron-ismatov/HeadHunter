package com.example.headhunter2.entities;

import jakarta.persistence.*;
import lombok.*;

//@Data
@Getter
@Setter
@Entity @Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String password;

    @ManyToOne
    private Role role;

}

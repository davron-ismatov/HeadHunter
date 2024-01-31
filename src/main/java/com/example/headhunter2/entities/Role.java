package com.example.headhunter2.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity @Table(name = "role")
//@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String role_name;

    @OneToMany(mappedBy = "role",cascade = CascadeType.ALL)
    private Set<Users> users = new HashSet<>();

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Permission> permissions;
}

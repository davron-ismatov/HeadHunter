package com.example.headhunter2.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

//@Data
@Getter
@Setter
@Entity @Table(name = "permission")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String permission_name;


}

package com.example.headhunter2.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Entity @Table(name = "companies")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String company_name;
    private String company_desc;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Users> users;
    private String address;
    private Integer created_year;
    private String web_site_link;
    @Email
    private String email;
}

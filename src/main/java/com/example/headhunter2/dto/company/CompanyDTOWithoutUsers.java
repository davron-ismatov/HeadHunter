package com.example.headhunter2.dto.company;

import com.example.headhunter2.entities.Users;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTOWithoutUsers {
    private Integer id;
    private String company_name;
    private String company_desc;
    private String address;
    private Integer created_year;
    private String web_site_link;
    private String email;
}

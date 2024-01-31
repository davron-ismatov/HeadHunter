package com.example.headhunter2.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "candidates")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Candidates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(cascade = CascadeType.ALL)
    private Users users;

    private String first_name;
    private String last_name;
    private String address;
    @Size(min = 9,max = 13)
    @Pattern(regexp = "^\\+998+[0-9]{9,13}$")
    private String telNum;
}

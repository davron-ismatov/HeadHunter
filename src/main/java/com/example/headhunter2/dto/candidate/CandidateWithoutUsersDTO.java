package com.example.headhunter2.dto.candidate;

import com.example.headhunter2.entities.Users;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateWithoutUsersDTO {

    private Integer id;
    private String first_name;
    private String last_name;
    private String address;
    private String telNum;
}

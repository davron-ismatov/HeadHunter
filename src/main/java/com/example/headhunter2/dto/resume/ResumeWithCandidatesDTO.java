package com.example.headhunter2.dto.resume;

import com.example.headhunter2.dto.candidate.CandidateWithoutUsersDTO;
import com.example.headhunter2.entities.Candidates;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeWithCandidatesDTO {
    private Integer id;
    private CandidateWithoutUsersDTO candidates;
    private String title;
    private String description;
}

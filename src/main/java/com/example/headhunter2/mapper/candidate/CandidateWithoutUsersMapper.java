package com.example.headhunter2.mapper.candidate;

import com.example.headhunter2.dto.candidate.CandidateWithoutUsersDTO;
import com.example.headhunter2.entities.Candidates;
import com.example.headhunter2.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CandidateWithoutUsersMapper extends EntityMapper<CandidateWithoutUsersDTO, Candidates> {
}

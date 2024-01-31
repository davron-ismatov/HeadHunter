package com.example.headhunter2.mapper.resume;

import com.example.headhunter2.dto.resume.ResumeWithoutCandidatesDTO;
import com.example.headhunter2.entities.Resume;
import com.example.headhunter2.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResumeWithoutCandidatesMapper extends EntityMapper<ResumeWithoutCandidatesDTO, Resume> {
}

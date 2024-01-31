package com.example.headhunter2.mapper.company;

import com.example.headhunter2.dto.company.CompanyCreateDTO;
import com.example.headhunter2.entities.Company;
import com.example.headhunter2.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyCreateMapper extends EntityMapper<CompanyCreateDTO, Company> {
}

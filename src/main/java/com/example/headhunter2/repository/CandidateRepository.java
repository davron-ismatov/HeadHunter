package com.example.headhunter2.repository;

import com.example.headhunter2.entities.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidates,Integer> {
}

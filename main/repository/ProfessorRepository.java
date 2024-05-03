package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    // Additional custom methods can be added here if needed
}

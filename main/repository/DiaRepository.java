package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.Dia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaRepository extends JpaRepository<Dia, Long> {
    // If specific queries related to days are required, add them here
}

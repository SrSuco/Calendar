package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarioRepository extends JpaRepository<Calendario, Long> {
    // Add methods to query calendar entries, e.g., findByDay, findByProfessor, etc.
}

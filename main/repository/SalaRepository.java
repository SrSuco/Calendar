package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalaRepository extends JpaRepository<Sala, Long> {
    List<Sala> findByNomeSala(String nomeSala);
}

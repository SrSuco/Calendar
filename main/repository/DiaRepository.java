package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.Dia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiaRepository extends JpaRepository<Dia, Long> {
    List<Dia> findByNomeDia(String nomeDia);
}

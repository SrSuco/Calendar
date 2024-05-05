package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.SemestreCurso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SemestreCursoRepository extends JpaRepository<SemestreCurso, Long> {
    List<SemestreCurso> findBySemestre(String semestre);
}

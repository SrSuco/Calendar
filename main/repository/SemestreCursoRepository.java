package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.SemestreCurso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemestreCursoRepository extends JpaRepository<SemestreCurso, Long> {

}

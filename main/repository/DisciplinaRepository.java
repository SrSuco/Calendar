package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.Dia;
import com.poo.springjpademo.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DiaRepository extends JpaRepository<Dia, Long> {

    List<Dia> findAllByDia(Dia dia);

}

package com.poo.springjpademo;

import com.poo.springjpademo.entity.Disciplina;
import com.poo.springjpademo.entity.Professor;
import com.poo.springjpademo.repository.DisciplinaRepository;
import com.poo.springjpademo.repository.ProfessorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Sort;

import java.util.Optional;

@SpringBootApplication
public class SpringjpademoApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringjpademoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringjpademoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ProfessorRepository professorRepository, DisciplinaRepository disciplinaRepository) {
        return (args) -> {
            try {
                professorRepository.save(new Professor("Leanderson"));
                professorRepository.save(new Professor("Paulo"));
                professorRepository.save(new Professor("Vanessa"));

                log.info("-------------------------------");
                log.info("findAll");
                professorRepository.findAll().forEach(prof -> log.info(prof.toString()));

                log.info("-------------------------------");
                log.info("findAllOrderByNomeDesc");
                professorRepository.findAll(Sort.by(Sort.Direction.DESC, "nome")).forEach(prof -> log.info(prof.toString()));

                log.info("-------------------------------");
                Optional<Professor> p = professorRepository.findById(1L);
                p.ifPresent(prof -> {
                    log.info("Professor found: " + prof.toString());
                    disciplinaRepository.save(new Disciplina("Poo 1"));
                    disciplinaRepository.save(new Disciplina("Poo 2"));
                    disciplinaRepository.save(new Disciplina("PCE"));
                });

                log.info("-------------------------------");
                p = professorRepository.findByNome("Vanessa").stream().findFirst();
                p.ifPresent(prof -> {
                    log.info("Professor found by name: " + prof.toString());
                    disciplinaRepository.save(new Disciplina("IA"));
                    disciplinaRepository.save(new Disciplina("Redes"));
                });

                log.info("-------------------------------");
                log.info("Disciplinas");
                disciplinaRepository.findAll().forEach(disc -> log.info(disc.toString()));
            } catch (Exception e) {
                log.error("An error occurred: " + e.getMessage());
            }
        };
    }
}

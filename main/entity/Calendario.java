package src.main.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Calendario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_disciplina")
    private Disciplina disciplina;

    @ManyToOne
    @JoinColumn(name = "id_professor")
    private Professor professor;

    @ManyToOne
    @JoinColumn(name = "id_sala")
    private Sala sala;

    @ManyToOne
    @JoinColumn(name = "id_dia")
    private Dia dia;

    @ManyToOne
    @JoinColumn(name = "id_semestre_curso")
    private SemestreCurso semestreCurso;
}

package es.educastur.jantoniora16.gestiondocente.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "horarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer dia;  // 1=Lunes, 2=Martes...
    private Integer hora; // 1=8:30, 2=9:25...
    private String aula;

    // Relación: Un docente imparte este horario
    @ManyToOne
    @JoinColumn(name = "docente_id")
    private Docente docente;

    // Relación: En este horario se imparte una asignatura
    @ManyToOne
    @JoinColumn(name = "asignatura_id")
    private Asignatura asignatura;
}
package es.educastur.jantoniora16.gestiondocente.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "asignaturas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String siglas;
    private Integer curso;

    // Relación: Una asignatura pertenece a un ciclo
    @ManyToOne
    @JoinColumn(name = "ciclo_id")
    private Ciclo ciclo;
}
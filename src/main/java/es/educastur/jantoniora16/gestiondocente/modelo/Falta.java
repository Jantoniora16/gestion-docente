package es.educastur.jantoniora16.gestiondocente.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "faltas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Falta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private String anotacion;
    private String material;

    // RELACIONES

    // La falta ocurre en un tramo horario específico (sabemos asignatura y aula)
    @ManyToOne
    @JoinColumn(name = "horario_id")
    private Horario horario;

    // Relación "cubre": El docente que hace la guardia
    // Puede ser null si la falta se acaba de crear y nadie la ha cubierto aún
    @ManyToOne
    @JoinColumn(name = "docente_cubridor_id")
    private Docente docenteQueCubre; 
}
package es.educastur.jantoniora16.gestiondocente.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "docentes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellidos;
    private String email;
    private String siglas;

    // Relación: Pertenece a un departamento
    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    // Relación: Tiene un rol
    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;
}
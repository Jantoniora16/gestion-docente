package es.educastur.jantoniora16.gestiondocente.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "ciclos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ciclo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String familia;
    private String codigo;
}
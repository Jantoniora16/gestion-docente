package es.educastur.jantoniora16.gestiondocente.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "asuntos_propios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AsuntoPropio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate diaSolicitado;
    private String descripcion;
    
    private LocalDateTime fechaTramitacion; 
    
    private Boolean aprobado;

    // Relación: Un docente "dispone" de asuntos propios
    @ManyToOne
    @JoinColumn(name = "docente_id")
    private Docente docente;
}
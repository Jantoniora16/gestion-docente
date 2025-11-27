package es.educastur.jantoniora16.gestiondocente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import es.educastur.jantoniora16.gestiondocente.modelo.Horario;

public interface HorarioRepository extends JpaRepository<Horario, Long> {
}
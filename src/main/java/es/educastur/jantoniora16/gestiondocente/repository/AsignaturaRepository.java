package es.educastur.jantoniora16.gestiondocente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import es.educastur.jantoniora16.gestiondocente.modelo.Asignatura;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {
}
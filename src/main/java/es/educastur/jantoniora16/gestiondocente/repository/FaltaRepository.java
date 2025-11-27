package es.educastur.jantoniora16.gestiondocente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import es.educastur.jantoniora16.gestiondocente.modelo.Falta;

public interface FaltaRepository extends JpaRepository<Falta, Long> {
}
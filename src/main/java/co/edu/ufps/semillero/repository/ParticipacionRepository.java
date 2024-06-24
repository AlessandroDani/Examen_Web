package co.edu.ufps.semillero.repository;

import co.edu.ufps.semillero.model.Participacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipacionRepository extends JpaRepository<Participacion, Long> {
}

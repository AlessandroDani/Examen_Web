package co.edu.ufps.semillero.repository;

import co.edu.ufps.semillero.model.Linea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineaRepository extends JpaRepository<Linea, Integer> {
}

package co.edu.ufps.semillero.repository;

import co.edu.ufps.semillero.model.Actividad;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadRepository extends JpaRepository<Actividad, Integer> {
	
	@Query("SELECT a FROM Actividad a WHERE a.proyecto.id = :proyectoId")
    List<Actividad> findByProyectoId(@Param("proyectoId") int proyectoId);
	
}

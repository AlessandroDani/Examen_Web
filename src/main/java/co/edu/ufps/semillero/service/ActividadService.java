package co.edu.ufps.semillero.service;

import co.edu.ufps.semillero.model.Actividad;
import co.edu.ufps.semillero.repository.ActividadRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadService {

    @Autowired
    private ActividadRepository actividadRepository;

    public void eliminarActividad(int id) {
        if (actividadRepository.existsById(id)) {
            actividadRepository.deleteById(id);
        } else {
            throw new RuntimeException("Actividad no encontrada con el id: " + id);
        }
    }
    
    public List<Actividad> obtenerActividadesPorProyectoId(int proyectoId) {
        return actividadRepository.findByProyectoId(proyectoId);
    }
}

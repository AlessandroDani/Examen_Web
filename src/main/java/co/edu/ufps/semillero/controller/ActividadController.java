package co.edu.ufps.semillero.controller;

import co.edu.ufps.semillero.service.ActividadService;
import co.edu.ufps.semillero.model.Actividad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ActividadController {

    @Autowired
    private ActividadService actividadService;

    /**
     * Metodo que elimina la actividad por id
     * @param id
     * @return mensaje de que la actividad fue eliminada
     */
    @DeleteMapping("/actividades/{id}")
    public String eliminarActividad(@PathVariable int id) {
        try {
            actividadService.eliminarActividad(id);
            return "Actividad eliminada exitosamente.";
        } catch (RuntimeException e) {
            return e.getMessage();
        }
    }
    
    /**
     * Metodo que se le envia un id del proyecto
     * @param proyectoId
     * @return el proyecto con todas las actividades
     */
    @GetMapping("/proyectos/{proyectoId}/actividades")
    public List<Actividad> obtenerActividadesPorProyectoId(@PathVariable int proyectoId) {
        return actividadService.obtenerActividadesPorProyectoId(proyectoId);
    }
}

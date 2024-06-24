package co.edu.ufps.semillero.controller;

import co.edu.ufps.semillero.service.ActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ActividadController {

    @Autowired
    private ActividadService actividadService;

    @DeleteMapping("/actividades/{id}")
    public String eliminarActividad(@PathVariable int id) {
        try {
            actividadService.eliminarActividad(id);
            return "Actividad eliminada exitosamente.";
        } catch (RuntimeException e) {
            return e.getMessage();
        }
    }
}

package co.edu.ufps.semillero.controller;

import co.edu.ufps.semillero.model.Capacitacion;
import co.edu.ufps.semillero.service.CapacitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CapacitacionController {

    @Autowired
    private CapacitacionService capacitacionService;

    /**
     * Metodo lista las capacitaciones, no me tocaba pero la hice :D
     * @return
     */
    @GetMapping("/api/capacitaciones")
    public List<Capacitacion> listarCapacitaciones() {
        return capacitacionService.listarCapacitaciones();
    }
    
    /**
     * Metodo que crea una capacitación 
     * @param capacitacion
     * @return Objeto Capacitación
     */
    @PostMapping("/api/capacitacion")
    public Capacitacion crearCapacitacion(@RequestBody Capacitacion capacitacion) {
        return capacitacionService.crearCapacitacion(capacitacion);
    }
}

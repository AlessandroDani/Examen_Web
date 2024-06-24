package co.edu.ufps.semillero.controller;

import co.edu.ufps.semillero.model.Linea;
import co.edu.ufps.semillero.service.LineaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LineaController {

    @Autowired
    private LineaService lineaService;

    /**
     * Metodo que actualiza la linea recibiendo un id
     * @param id
     * @param nuevaLinea
     * @return la linea con los cambios
     */
    @PutMapping("/lineas/{id}")
    public Linea actualizarLinea(@PathVariable int id, @RequestBody Linea nuevaLinea) {
        return lineaService.actualizarLinea(id, nuevaLinea);
    }
}

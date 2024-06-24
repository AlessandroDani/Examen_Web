package co.edu.ufps.semillero.controller;

import co.edu.ufps.semillero.model.Area;
import co.edu.ufps.semillero.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @GetMapping("/areas")
    public List<Area> listarAreas() {
        return areaService.listarAreas();
    }

    @GetMapping("/areas/{id}")
    public Area obtenerAreaPorId(@PathVariable int id) {
        return areaService.obtenerAreaPorId(id);
    }

    @PostMapping("/areas")
    public Area crearArea(@RequestBody Area area) {
        return areaService.crearArea(area);
    }

    @PutMapping("/areas/{id}")
    public Area actualizarArea(@PathVariable int id, @RequestBody Area nuevaArea) {
        return areaService.actualizarArea(id, nuevaArea);
    }

    @DeleteMapping("/areas/{id}")
    public void eliminarArea(@PathVariable int id) {
        areaService.eliminarArea(id);
    }
}

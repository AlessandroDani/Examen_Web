package co.edu.ufps.semillero.controller;

import co.edu.ufps.semillero.model.Director;
import co.edu.ufps.semillero.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DirectorController {

    @Autowired
    private DirectorService directorService;

    @GetMapping("/directores/{id}")
    public Optional<Director> obtenerDirector(@PathVariable int id) {
        return directorService.obtenerDirector(id);
    }
}

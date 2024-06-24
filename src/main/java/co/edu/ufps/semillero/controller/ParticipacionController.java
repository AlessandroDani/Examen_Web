package co.edu.ufps.semillero.controller;

import co.edu.ufps.semillero.model.Participacion;
import co.edu.ufps.semillero.service.ParticipacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ParticipacionController {

    @Autowired
    private ParticipacionService participacionService;

    @GetMapping("/participaciones")
    public List<Participacion> listarParticipaciones() {
        return participacionService.listarParticipaciones();
    }
}

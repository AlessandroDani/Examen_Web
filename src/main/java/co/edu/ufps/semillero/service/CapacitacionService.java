package co.edu.ufps.semillero.service;

import co.edu.ufps.semillero.model.Capacitacion;
import co.edu.ufps.semillero.repository.CapacitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapacitacionService {

    @Autowired
    private CapacitacionRepository capacitacionRepository;

    public List<Capacitacion> listarCapacitaciones() {
        return capacitacionRepository.findAll();
    }
    
    public Capacitacion crearCapacitacion(Capacitacion capacitacion) {
        return capacitacionRepository.save(capacitacion);
    }
}

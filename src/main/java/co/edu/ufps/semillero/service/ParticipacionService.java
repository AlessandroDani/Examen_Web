package co.edu.ufps.semillero.service;

import co.edu.ufps.semillero.model.Participacion;
import co.edu.ufps.semillero.repository.ParticipacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipacionService {

    @Autowired
    private ParticipacionRepository participacionRepository;

    public List<Participacion> listarParticipaciones() {
        return participacionRepository.findAll();
    }
}

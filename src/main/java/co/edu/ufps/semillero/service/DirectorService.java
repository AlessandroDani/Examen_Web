package co.edu.ufps.semillero.service;

import co.edu.ufps.semillero.model.Director;
import co.edu.ufps.semillero.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    public Optional<Director> obtenerDirector(int id) {
        return directorRepository.findById(id);
    }
}

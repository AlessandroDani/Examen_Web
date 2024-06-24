package co.edu.ufps.semillero.service;

import co.edu.ufps.semillero.model.Linea;
import co.edu.ufps.semillero.repository.LineaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LineaService {

    @Autowired
    private LineaRepository lineaRepository;

    public Linea actualizarLinea(int id, Linea nuevaLinea) {
        Optional<Linea> lineaExistente = lineaRepository.findById(id);
        if (lineaExistente.isPresent()) {
            Linea linea = lineaExistente.get();
            linea.setNombre(nuevaLinea.getNombre());
            linea.setDescripcion(nuevaLinea.getDescripcion());
            return lineaRepository.save(linea);
        } else {
            return null; // o puedes lanzar una excepción si la línea no se encuentra
        }
    }
}

package co.edu.ufps.semillero.service;

import co.edu.ufps.semillero.model.Area;
import co.edu.ufps.semillero.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AreaService {

    @Autowired
    private AreaRepository areaRepository;

    public List<Area> listarAreas() {
        return areaRepository.findAll();
    }

    public Area obtenerAreaPorId(int id) {
        return areaRepository.findById(id).orElse(null);
    }

    public Area crearArea(Area area) {
        return areaRepository.save(area);
    }

    public Area actualizarArea(int id, Area nuevaArea) {
        Optional<Area> areaExistente = areaRepository.findById(id);
        if (areaExistente.isPresent()) {
            Area area = areaExistente.get();
            area.setNombre(nuevaArea.getNombre());
            area.setSemilleros(nuevaArea.getSemilleros());
            return areaRepository.save(area);
        } else {
            return null; // o puedes lanzar una excepción si el área no se encuentra
        }
    }

    public void eliminarArea(int id) {
        areaRepository.deleteById(id);
    }
}

package com.pruebanueva.security.service;

import com.pruebanueva.security.model.Proyectos;
import com.pruebanueva.security.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {
    @Autowired
    public ProyectosRepository proRepo;

    @Override
    public List<Proyectos> verProyectos() {
        return proRepo.findAll();
    }

    @Override
    public void crearProyectos(Proyectos pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarProyectos(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyectos(Long id) {
      return proRepo.findById(id).orElse(null);
    }
}

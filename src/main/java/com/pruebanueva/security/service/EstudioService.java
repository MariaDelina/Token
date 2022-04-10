package com.pruebanueva.security.service;

import com.pruebanueva.security.model.Estudio;
import com.pruebanueva.security.repository.EstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioService implements IEstudioService{
    
    @Autowired
    public EstudioRepository estRepo;

    @Override
    public List<Estudio> verEstudio() {
        return estRepo.findAll();
    }

    @Override
    public void agregarEstudio(Estudio est) {
        estRepo.save(est);
    }

    @Override
    public void borrarEstudio(Long id) {
        estRepo.deleteById(id);
    }

    @Override
    public Estudio buscarEstudio(Long id) {
        return estRepo.findById(id).orElse(null);
    }
    
}


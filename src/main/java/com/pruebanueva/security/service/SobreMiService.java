package com.pruebanueva.security.service;


import com.pruebanueva.security.model.SobreMi;
import com.pruebanueva.security.repository.SobreMiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SobreMiService implements ISobreMiService{
    
    @Autowired
    public SobreMiRepository sobRepo;

    @Override
    public List<SobreMi> verSobreMi() {
        return sobRepo.findAll();
    }

    @Override
    public void agregarSobreMi(SobreMi sob) {
        sobRepo.save(sob);
    }

    @Override
    public void borrarSobreMi(Long id) {
        sobRepo.deleteById(id);
    }

    @Override
    public SobreMi buscarSobreMi(Long id) {
        return sobRepo.findById(id).orElse(null);
    }
}

package com.pruebanueva.security.service;


import com.pruebanueva.security.model.SobreMi;
import java.util.List;


public interface ISobreMiService {
    
    public List<SobreMi> verSobreMi();
    public void agregarSobreMi(SobreMi Sob);
    public void borrarSobreMi(Long id);
    public SobreMi buscarSobreMi(Long id);
    
}


package com.pruebanueva.security.service;


import com.pruebanueva.security.model.Estudio;
import java.util.List;


public interface IEstudioService {
    
    public List<Estudio> verEstudio();
    
    public void agregarEstudio (Estudio est);
    
    public void borrarEstudio (Long id);
    
    public Estudio buscarEstudio (Long id);
    
    
}

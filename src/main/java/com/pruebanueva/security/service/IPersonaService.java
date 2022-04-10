package com.pruebanueva.security.service;


import com.pruebanueva.security.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersonas();
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (Long id_proyectos);
    
    public Persona buscarPersona (Long id_proyectos);
}


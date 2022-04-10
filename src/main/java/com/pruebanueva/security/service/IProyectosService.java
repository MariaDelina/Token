package com.pruebanueva.security.service;


import com.pruebanueva.security.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    
    public List<Proyectos> verProyectos ();
    public void crearProyectos(Proyectos pro);
    public void borrarProyectos(Long id);
    public Proyectos buscarProyectos(Long id);
}

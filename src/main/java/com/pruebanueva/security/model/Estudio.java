package com.pruebanueva.security.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "estudio")
public class Estudio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "titulo")
    private String titulo;
    
    @Column(name = "logo")
    private String logo;
    
    @Column(name = "institucion")
    private String institucion;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    public Estudio(){
        
    }
    
    public Estudio(Long id, String titulo, String logo, String institucion, String descripcion){
        this.id = id;
        this.titulo = titulo;
        this.logo = logo;
        this.institucion = institucion;
        this.descripcion = descripcion;
    }
    
}


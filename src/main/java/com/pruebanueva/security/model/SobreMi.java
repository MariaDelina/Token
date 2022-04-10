package com.pruebanueva.security.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "sobremi")
public class SobreMi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "cualidades")
    private String cualidades;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "puntosfuertes")
    private String puntosfuertes;
    
    public SobreMi(){
        
    }
    public SobreMi(Long id, String cualidades, String descripcion, String puntosfuertes) {
        this.id = id;
        this.cualidades = cualidades;
        this.descripcion = descripcion;
        this.puntosfuertes = puntosfuertes;
    }
}


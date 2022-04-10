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
@Table(name = "proyectos")
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "proyecto1")
    private String proyecto1;
    @Column(name = "proyecto2")
    private String proyecto2;
    
    public Proyectos(){
    
    }
    public Proyectos(Long id, String proyecto1, String proyecto2){
        this.id = id;
        this.proyecto1 = proyecto1;
        this.proyecto2 = proyecto2;
    }
}


package com.pruebanueva.security.repository;


import com.pruebanueva.security.model.SobreMi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SobreMiRepository extends JpaRepository<SobreMi, Long>{
    
}

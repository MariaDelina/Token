
package com.pruebanueva.security.repository;

import com.pruebanueva.security.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository <Estudio, Long>{
    
}



package com.practica01.dao;

import com.practica01.domain.Aduanas;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ignacio Barquero
 */
public interface ClienteDao extends JpaRepository<Aduanas,Long>{
    
}

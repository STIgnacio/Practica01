
package com.practica01.dao;

import com.practica01.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ignacio Barquero
 */
public interface ClienteDao extends JpaRepository<Cliente,Long>{
    
}

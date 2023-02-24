
package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Ignacio Barquero
 */
@Data
@Entity
@Table(name= "aduana")
public class Aduanas implements Serializable{
    private static final long serialVersioniUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAduana;
    
    private String estado;
    private String capital;
    private String poblacion;
    private String costas;

    public Aduanas() {
    }

    public Aduanas(String estado, String capital, String poblacion, String costas) {
        this.estado = estado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }
    
}

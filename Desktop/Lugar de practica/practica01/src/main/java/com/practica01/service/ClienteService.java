
package com.practica01.service;

import com.practica01.domain.Aduanas;
import java.util.List;

/**
 *
 * @author Ignacio Barquero
 */
public interface ClienteService {
    
    //Obtiene los registros y los coloca en una lista de objetos
    public List<Aduanas> getClientes();
    
    //Obtiene el ID del cliente
    public Aduanas getCliente(Aduanas aduana);
    
    //Elimina por ID
    public void deleteCliente(Aduanas aduana);
    
    //Si el ID no existe se crea un registro nuevo 
    //Si el ID existe se actualizan los datos
    public void saveCliente(Aduanas cliente);
    
}

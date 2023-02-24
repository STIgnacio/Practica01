
package com.practica01.service.impl;

import com.practica01.dao.ClienteDao;
import com.practica01.domain.Aduanas;
import com.practica01.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ignacio Barquero
 */
@Service
public class ClienteServiceImpl implements ClienteService{
    
    //Crea una copia de un objeto
    @Autowired
    private ClienteDao clienteDao;

    @Override
    public List<Aduanas> getClientes() {
        return (List<Aduanas>) clienteDao.findAll();
    }

    @Override
    public Aduanas getCliente(Aduanas cliente) {
        return clienteDao.findById(cliente.getIdAduana()).orElse(null);
    }

    @Override
    public void deleteCliente(Aduanas cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    public void saveCliente(Aduanas cliente) {
        clienteDao.save(cliente);
    }
    
    
}

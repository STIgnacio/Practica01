
package com.practica01.controller;

import com.practica01.domain.Aduanas;
import com.practica01.service.ClienteService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author Ignacio Barquero
 */
@Controller
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var aduanas=clienteService.getClientes();
        model.addAttribute("aduanas",aduanas);
        return "index";
    }
    
    @GetMapping("/aduana/eliminar/{idAduana}")
    public String eliminarCliente(Aduanas aduana){
        clienteService.deleteCliente(aduana);
        return "redirect:/";
    
    }
    
    @GetMapping("/aduana/nuevo")
    public String nuevoCliente(Aduanas aduana){
        return "modificaCliente";
    
    }
    
    @PostMapping("/cliente/guardar")
    public String guardarCliente(Aduanas cliente){
        clienteService.saveCliente(cliente);
        return "redirect:/";
    
    }
    
    @GetMapping("/cliente/modificar/{idCliente}")
    public String modificaCliente(Aduanas cliente, Model model){
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "modificaCliente";
    
    }
}


package com.tienda_v1.controller;

import com.tienda_v1.domain.Cliente;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Ignacio Barquero
 */
@Controller
public class ClienteController {
    @GetMapping("/")
    public String inicio(Model model){
        var saludo="Back End";
        model.addAttribute("mensaje", saludo);
        
        Cliente cliente1=new Cliente("Juan","Contreras Villa","askfwaif@gmail.com","432423");
        Cliente cliente2=new Cliente("Pedro","Contreras Villa","fwfdfsd@gmail.com","432423");
        Cliente cliente3=new Cliente("Felipe","Contreras Villa","wqweqw22@gmail.com","432423");
        
        var clientes=Arrays.asList(cliente1,cliente2,cliente3);
        
        model.addAttribute("clientes", clientes);
        
        return "index";
    }
}

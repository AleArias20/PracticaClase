package com.practicaClase.restcontrollers;

import com.practicaClase.models.Cliente;
import com.practicaClase.services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteRestcontrollers {

    @Autowired
    ClienteServices servicio;

    @CrossOrigin(origins="http://localhost:4200")
    @GetMapping("/list")
    public List<Cliente> list(){
        return servicio.list();
    }
}

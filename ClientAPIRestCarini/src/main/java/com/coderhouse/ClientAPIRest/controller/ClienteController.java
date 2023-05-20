package com.coderhouse.ClientAPIRest.controller;

import com.coderhouse.ClientAPIRest.model.Cliente;
import com.coderhouse.ClientAPIRest.model.ClienteDTO;
import com.coderhouse.ClientAPIRest.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/client")
public class ClienteController {
    private ClienteService clienteService;

    // Constructor para inyectar el ClienteService

    @GetMapping("/cliente/{id}")
    public ClienteDTO obtenerCliente(@PathVariable int id) {
        Cliente cliente = clienteService.obtenerCliente(id);
        int edad = clienteService.calcularEdad(cliente.getFechaNacimiento());

        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setId(id);
        clienteDTO.setNombre(cliente.getNombre());
        clienteDTO.setApellido(cliente.getApellido());
        clienteDTO.setEdad(edad);

        return clienteDTO;
    }
}

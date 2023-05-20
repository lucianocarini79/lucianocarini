package com.coderhouse.ClientAPIRest.service;

import com.coderhouse.ClientAPIRest.model.Cliente;

import java.time.LocalDate;
import java.time.Period;

public class ClienteService {
    public Cliente obtenerCliente(int id) {
        // Lógica para obtener el cliente de la base de datos por su id

        // Supongamos que el cliente se obtiene de alguna manera y se almacena en la variable "cliente"
        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNombre("Luciano");
        cliente.setApellido("Carini");
        cliente.setFechaNacimiento(LocalDate.of(2005, 2, 4));

        return cliente;
    }

    public int calcularEdad(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }
}

package com.coderhouse.ClientAPIRest.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
@Table(name = "clientDTO")
public class ClienteDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Nonnull
    @Column(length = 75)
    private String nombre;
    private String apellido;
    private int edad;

    // Constructor, getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() { return edad;}

    public void setEdad(int edad) {this.edad = edad;}

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}

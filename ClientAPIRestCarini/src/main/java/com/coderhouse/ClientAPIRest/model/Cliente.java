package com.coderhouse.ClientAPIRest.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "client")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Nonnull
    @Column(length = 75)
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechanacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}

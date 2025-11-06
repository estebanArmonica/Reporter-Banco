/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reportesbanco.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 *
 * @author esteb
 */
public class ClienteDTO {
    private int id;
    private String cedula, nombre, apellido, email;
    private int telefono;
    private String direccion;
    private LocalDate fechNacimiento;
    private LocalDateTime fechRegistro;
    private boolean estado;

    public ClienteDTO() {
    }

    public ClienteDTO(int id, String cedula, String nombre, String apellido, String email, int telefono, String direccion, LocalDate fechNacimiento, LocalDateTime fechRegistro, boolean estado) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechNacimiento = fechNacimiento;
        this.fechRegistro = fechRegistro;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechNacimiento() {
        return fechNacimiento;
    }

    public void setFechNacimiento(LocalDate fechNacimiento) {
        this.fechNacimiento = fechNacimiento;
    }

    public LocalDateTime getFechRegistro() {
        return fechRegistro;
    }

    public void setFechRegistro(LocalDateTime fechRegistro) {
        this.fechRegistro = fechRegistro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" + "id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + ", direccion=" + direccion + ", fechNacimiento=" + fechNacimiento + ", fechRegistro=" + fechRegistro + ", estado=" + estado + '}';
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reportesbanco.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
/**
 *
 * @author esteb
 */
public class CuentaDTO {
    private int id;
    private String numCuenta;
    private ClienteDTO clienteDTO;
    private String tipoCuenta;
    private BigDecimal saldo;
    private LocalDateTime fechaApertura;
    private boolean estado;

    public CuentaDTO() {
    }

    public CuentaDTO(int id, String numCuenta, ClienteDTO clienteDTO, String tipoCuenta, BigDecimal saldo, LocalDateTime fechaApertura, boolean estado) {
        this.id = id;
        this.numCuenta = numCuenta;
        this.clienteDTO = clienteDTO;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = clienteDTO;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDateTime fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CuentaDTO{" + "id=" + id + ", numCuenta=" + numCuenta + ", clienteDTO=" + clienteDTO + ", tipoCuenta=" + tipoCuenta + ", saldo=" + saldo + ", fechaApertura=" + fechaApertura + ", estado=" + estado + '}';
    }
}

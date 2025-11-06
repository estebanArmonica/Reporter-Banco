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
public class TransaccionDTO {
    private int id;
    private CuentaDTO cuentaDTO;
    private String tipoTransaccion;
    private BigDecimal monto;
    private String descripcion;
    private LocalDateTime fechaTransaccion;
    private BigDecimal saldoAnterior;
    private BigDecimal saldoPosterior;

    public TransaccionDTO() {
    }

    public TransaccionDTO(int id, CuentaDTO cuentaDTO, String tipoTransaccion, BigDecimal monto, String descripcion, LocalDateTime fechaTransaccion, BigDecimal saldoAnterior, BigDecimal saldoPosterior) {
        this.id = id;
        this.cuentaDTO = cuentaDTO;
        this.tipoTransaccion = tipoTransaccion;
        this.monto = monto;
        this.descripcion = descripcion;
        this.fechaTransaccion = fechaTransaccion;
        this.saldoAnterior = saldoAnterior;
        this.saldoPosterior = saldoPosterior;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CuentaDTO getCuentaDTO() {
        return cuentaDTO;
    }

    public void setCuentaDTO(CuentaDTO cuentaDTO) {
        this.cuentaDTO = cuentaDTO;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(LocalDateTime fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public BigDecimal getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(BigDecimal saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public BigDecimal getSaldoPosterior() {
        return saldoPosterior;
    }

    public void setSaldoPosterior(BigDecimal saldoPosterior) {
        this.saldoPosterior = saldoPosterior;
    }

    @Override
    public String toString() {
        return "TransaccionDTO{" + "id=" + id + ", cuentaDTO=" + cuentaDTO + ", tipoTransaccion=" + tipoTransaccion + ", monto=" + monto + ", descripcion=" + descripcion + ", fechaTransaccion=" + fechaTransaccion + ", saldoAnterior=" + saldoAnterior + ", saldoPosterior=" + saldoPosterior + '}';
    }
}

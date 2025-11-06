/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reportesbanco.daos;

import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import com.reportesbanco.models.ClienteDTO;
import com.reportesbanco.conexion.Conexion;
/**
 *
 * @author esteb
 */
public class ClienteDAO {
    Conexion con = new Conexion();
    
    public int agregarCliente(ClienteDTO cli) throws Exception, ClassNotFoundException {
        con.acceder();
        String sql = "INSERT INTO cliente(cedula, nombre, apellido, email, telefono, direccion, fech_naci) VALUES(?,?,?,?,?,?,?)";
        PreparedStatement consulta = con.get().prepareStatement(sql);
        consulta.setString(1, cli.getCedula());
        consulta.setString(2, cli.getNombre());
        consulta.setString(3, cli.getApellido());
        consulta.setString(4, cli.getEmail());
        consulta.setInt(5, cli.getTelefono());
        consulta.setString(6, cli.getDireccion());
        
        java.sql.Date fechaParse = java.sql.Date.valueOf(cli.getFechNacimiento());
        consulta.setDate(7, fechaParse);
        consulta.execute();
        con.cerrar();
        return 1;
    }
    
    public int modificarCliente(ClienteDTO cli) throws Exception, ClassNotFoundException {
        con.acceder();
        String sql = "UPDATE cliente SET nombre=?, apellido=?, email=?, telefono=?, direccion=? WHERE id_cli=?";
        PreparedStatement consulta = con.get().prepareStatement(sql);
        consulta.setInt(6, cli.getId());
        consulta.setString(1, cli.getNombre());
        consulta.setString(2, cli.getApellido());
        consulta.setString(3, cli.getEmail());
        consulta.setInt(4, cli.getTelefono());
        consulta.setString(5, cli.getDireccion());
        consulta.executeUpdate();
        con.cerrar();
        return 1;
    }
    
    public int eliminarCliente(int id) throws Exception, ClassNotFoundException {
        con.acceder();
        String sql = "DELETE FROM cliente WHERE id_cli = ?";
        PreparedStatement consulta = con.get().prepareStatement(sql);
        consulta.setInt(1, id);
        consulta.execute();
        con.cerrar();
        return 1; 
    }
}

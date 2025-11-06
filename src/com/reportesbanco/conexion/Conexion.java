/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reportesbanco.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author esteb
 */
public class Conexion {
    Connection con;
    
    public boolean acceder() throws ClassNotFoundException, Exception {
        Class.forName("org.postgresql.Driver");
        
        String url = "jdbc:postgresql://localhost:5432/reporte_banco";
        String user = "postgres";
        String password = "admin";
        
        con = DriverManager.getConnection(url, user, password);
        System.out.println("✅ Conexión establecida a PostgreSQL");
        return true;
    }
    
    public Connection get() {
        return con;
    }
    
    // ✅ Método mejorado que obtiene la conexión directamente
    public Connection getConnection() throws Exception {
        if (con == null || con.isClosed()) {
            acceder();
        }
        return con;
    }
    
    public void cerrar() throws Exception {
        if(con != null && !con.isClosed()){
            con.close();
            System.out.println("🔌 Conexion Cerrada");
        }
    }
}

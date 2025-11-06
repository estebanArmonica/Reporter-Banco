/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reportesbanco.reports;

import com.reportesbanco.conexion.Conexion;

import java.sql.Connection;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFileChooser;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author esteb
 */
public class ReporteManager {

    Conexion con = new Conexion();

    public void generarReporteCliente() {
        try {
            // cargamos el diseño del reporte
            InputStream reporteStream = getClass().getResourceAsStream("/com/reportesbanco/reports/cliente_reports.jrxml");
            JasperDesign jasperDesign = JRXmlLoader.load(reporteStream);

            // creamos el objeto de jasper report
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

            // obtenemos la conexion de la base de datos
            Connection connection = con.getConnection();

            // verificamos que la conexion no sea nula
            if (connection == null) {
                System.err.println("❌ Error la conexion es nula");
                return;
            }

            // parametros del reporte
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("REPORT_TITLE", "Listado de Cliente del Banco");

            // cargamos la imagen
            InputStream logoStream = getClass().getResourceAsStream("/com/reportesbanco/reports/invoice_logo.png");
            if (logoStream != null) {
                parameters.put("LOGO_IMAGE", logoStream);
            } else {
                System.err.println("⚠️ No se encontró la imagen invoice_logo.png");
            }

            // llenamos el reporte
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);

            // mostramos el reporte
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.setTitle("Reporte de Cliente");
            viewer.setVisible(true);
            // Cerramos el stream de la imagen después de usarlo
            if (logoStream != null) {
                logoStream.close();
            }
        } catch (Exception e) {
            System.err.println("❌ Error al generar reporte: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void generarReporteTransacciones(LocalDate fechaInicio, LocalDate fechaFin) {
        try {
            InputStream reportStream = getClass().getResourceAsStream("/reports/transacciones_report.jrxml");
            JasperDesign jasperDesign = JRXmlLoader.load(reportStream);

            // Configurar consulta con parámetros
            JRDesignQuery query = new JRDesignQuery();
            String sqlQuery = "SELECT * FROM transacciones WHERE fecha_transaccion BETWEEN ? AND ?";
            query.setText(sqlQuery);
            jasperDesign.setQuery(query);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            Connection connection = con.get();

            Map<String, Object> parameters = new HashMap<>();
            parameters.put("FECHA_INICIO", java.sql.Date.valueOf(fechaInicio));
            parameters.put("FECHA_FIN", java.sql.Date.valueOf(fechaFin));
            parameters.put("REPORT_TITLE", "Reporte de Transacciones");

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);

            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.setTitle("Reporte de Transacciones");
            viewer.setVisible(true);
            
            // exportamos a PDF
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar reporte como..");
            
            if(fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
                String rutaArchivo = fileChooser.getSelectedFile().getAbsolutePath();
                
                // aseguramos que tenga la extension de .pdf
                if(!rutaArchivo.toLowerCase().endsWith(".pdf")){
                    rutaArchivo += ".pdf";
                }
                
                // llamamos al método de exportar a pdf
                exportarReporteAPDF(rutaArchivo, jasperPrint);
                System.out.println("✅ PDF exportado a: " + rutaArchivo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void exportarReporteAPDF(String rutaArchivo, JasperPrint jasperPrint) {
        try {
            JasperExportManager.exportReportToPdfFile(jasperPrint, rutaArchivo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean eliminarReporte(String rutaArchivo) {
        java.io.File archivo = new java.io.File(rutaArchivo);
        return archivo.delete();
    }
}

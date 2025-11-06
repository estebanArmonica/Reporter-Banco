
# Reports Banks - Easy My Banks

Le presento una aplicación de escritorio el cual tiene como ayuda a generar reportes en formato PDF de todas las transacciones y listado de clientes del banco "Easy My Banks".

# Herramientas Necesarias
Para realizar este proyecto se utilizaron ciertas herramientas como dependencias:

> [!Importante]
> Muchas de las dependencias utilizadas son .jar ya que el proyecto no fue realizado con Maven o Gradle

- [ ]  Java Version 21 [Descargar JDK 21](https://www.oracle.com/java/technologies/downloads/#java21)
- [ ]  Apache NetBeans IDE 20 [Descargar NetBeans IDE 20](https://netbeans.apache.org/front/main/download/nb20/)
- [ ]  OpenPDF 1.3.43 [Ir a Maven](https://mvnrepository.com/artifact/com.github.librepdf/openpdf)
- [ ]  JasperReports 6.21.5 [Ir a Maven](https://mvnrepository.com/artifact/net.sf.jasperreports/jasperreports)
- [ ]  Common Digester 2.1 [Ir a Maven](https://mvnrepository.com/artifact/commons-digester/commons-digester)
- [ ]  Common Loggins 1.3.5 [Ir a Maven](https://mvnrepository.com/artifact/commons-logging/commons-logging)
- [ ]  Common Collections4 4.5.0 [Ir a Maven](https://mvnrepository.com/artifact/org.apache.commons/commons-collections4)
- [ ]  Common Beanutils 1.11.0 [Ir a Maven](https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils)

> [!Importante]
> el proyecto viene incluido con un caso practico "misma hitoria que es ficticia solo para uso practico de las herramientas" pero si esta historia tomara de referencia para otros proyectos más adelante

## Autor
- [@estebanArmonica](https://github.com/estebanArmonica)

## License
Este proyecto se incluye la licencia de Apache 2.0

[Apache License 2.0](http://www.apache.org/licenses/)

## Contribuciones

Toda contribución o sugerencia es bien recibida por parte del creador!

Si necesita contribuir en alguna parte puede encontrar un `contributing.md` donde podrá contribuir y enriquecer más partes de este proyecto.

Por Favor, recuerde que es un proyecto el cual puede ayudar a otros si encuentra algún favor de escribirlo en `contributing.md` y como soluciono ese problema, aqui nos ayudamos entre todos :).


# Historia de Easy My Banks
En 1985 Nace un banco llamado "Easy My Banks" con una filosofía simple pero poderosa: "La banca debe ser tan fácil como contar una historia". Comenzó como una pequeña cooperativa donde cada cliente era tratado como miembro de la familia. Para cumplir cada sueño financiero de sus clientes se utilizaba una libretia de papel encuadernada a mano donde se registraba cada transaccion y cada prestamo que los clientes solicitaban.

## La Era del papel
Por 15 años, Easy My Banks operó con:
- 3 libretas físicas: Clientes, Cuentas, Movimiento
- Cada Transaccion escrita con caligrafía impecable
- Reportes mensuales copiados a máquina de escribir
- Archivadores metálicos que llenaban una pequeña bodega

# Salto a la tecnología
En el 2000 se realizo el salto de la empresa donde cada proceso realizado a mano paso a ser digitalizado.

## El Problema del "Salto"
Si bien abandonaron el papel, cayeron en una nuevo problema:
- Exportaciones manuales de su base de datos a Excel
- Hojas de cálculo diferentes para cada tipo de reporte
- Discrepancia de datos entre diferentes versiones de reportes

# La Crisis de los Reportes
El problema de los reportes se causo cuando la gerente regional, necesitaba el "Reporte de Flujo de Efectivo Trimestral" para una reunión con supervisores bancarios a las 10:00 AM.

8:45 AM: Intentan generar el reporte

```bash
# ARCHIVO: Reporte_Financiero_Q1_2023.xlsx
# ERROR: #¡REF! en todas las celdas principales
# CAUSA: Enlaces rotos a tablas maestras
```
9:15 AM: Descubren que:

- 4 versiones diferentes del mismo reporte
- Datos inconsistentes entre ellos
- Falta de auditoría de cambios
- Tiempo promedio: 3 horas por reporte crítico

## Las Consecuencias
- Multa regulatoria de $50,000 por reporte tardío
- Pérdida de confianza de inversionistas
- Decisiones estratégicas basadas en datos incorrectos
- Frustración del personal y alta rotación

# El Diagnóstico del Problema
Al realizar un Diagnóstico se identificaron los problemas criticos:

## Problemas Técnicos
- Falta de estandarización en formatos de reportes
- Procesos manuales propensos a errores humanos
- Tiempos de generación excesivos
- Imposibilidad de personalización en tiempo real

## Problemas de Negocio:
- Incumplimiento regulatorio frecuente
- Decisiones lentas por falta de información oportuna
- Alto costo operacional en generación de reportes
- Competitividad disminuida frente a bancos digitales

# La Solución Propuesta
La Solución propuesta fue crear una aplicación de escritorio el cual genera y migra reportes utilizando un motor de reportes.

## Arquitectura de la Aplicación de escritorio

```javascript
Easy My Banks - Sistema de Reportes
├── Conexión a PostgreSQL (tablas existentes)
├── Motor JasperReports
├── Plantillas .jrxml personalizadas
├── Exportación múltiple (PDF, Excel, HTML)
└── Interfaz gráfica intuitiva
```

Con esta arquitectura Easy My Banks tendra un sistema único de reportes con un software el cual ayude a generar y migrar datos en diferentes formatos.

## Impacto del Negocio
- Cero multas regulatorias en 6 meses
- Decisiones estratégicas basadas en datos en tiempo real
- Mejora en experiencia del cliente final
- Posicionamiento como banco innovado

# Pasos a Futuro de la Empresa
La aplicación de reportes es solo uno de las primeras visiones para ayudar a los diferentes problemas que ha tenido a lo largo de su trayecto. La visión completa de la empresa no solo incluye desarrollar reportes:

## Migración Gradual
- Fase 1: Reportes con JasperReports ✓
- Fase 2: Módulo de análisis predictivo
- Fase 3: Dashboard ejecutivo en tiempo real
- Fase 4: Integración con banca Móvil

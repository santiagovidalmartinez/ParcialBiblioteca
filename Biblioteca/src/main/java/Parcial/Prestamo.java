/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prestamo {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Multa multa;

    public Prestamo(String fechaInicio, String fechaFin) {
        this.fechaInicio = LocalDate.parse(fechaInicio);
        this.fechaFin = calcularFechaFin();
    }

    public String getFechaInicio() {
        return fechaInicio.toString();
    }

    public String getFechaFin() {
        return fechaFin.toString();
    }

    private LocalDate calcularFechaFin() {
        // Suponiendo que el préstamo dura 15 días
        return fechaInicio.plus(15, ChronoUnit.DAYS);
    }

    public void generarMulta() {
        if (LocalDate.now().isAfter(fechaFin)) {
            multa = new Multa("Retraso en la devolución", 10, "5/12/2023");
            System.out.println("Se ha generado una multa por retraso en la devolución.");
        } else {
            System.out.println("No hay multas pendientes.");
        }
    }

    public Multa getMulta() {
        return multa;
    }
}



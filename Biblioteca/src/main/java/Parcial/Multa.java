/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Multa {
    private String motivo;
    private double cantidad;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Multa(String motivo, double cantidad, String fechaInicio) {
        this.motivo = motivo;
        this.cantidad = cantidad;
        this.fechaInicio = LocalDate.parse(fechaInicio);
        this.fechaFin = calcularFechaFin();
    }

    public String getMotivo() {
        return motivo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getFechaInicio() {
        return fechaInicio.toString();
    }

    public String getFechaFin() {
        return fechaFin.toString();
    }

    private LocalDate calcularFechaFin() {
        // Supongamos que la multa dura 15 días
        return fechaInicio.plus(15, ChronoUnit.DAYS);
    }
}


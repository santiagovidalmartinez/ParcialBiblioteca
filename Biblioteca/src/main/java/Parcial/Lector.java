/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial;
import java.util.ArrayList;
import java.util.List;

public class Lector {
    private String nombre;
    private String direccion;
    private List<Multa> multas;

    public Lector(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.multas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void agregarMulta(Multa multa) {
        multas.add(multa);
    }

    public void comprobarMultasPendientes() {
        if (multas.isEmpty()) {
            System.out.println("No tienes multas pendientes.");
        } else {
            System.out.println("Tienes " + multas.size() + " multas pendientes.");
            for (Multa multa : multas) {
                System.out.println("Motivo: " + multa.getMotivo() + ", Cantidad: " + multa.getCantidad());
            }
        }
    }
}


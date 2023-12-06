/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial;

/**
 *
 * @author ACER
 */
public class Copia {
    private String identificado;
    private String estado;

    public Copia(String identificado, String estado) {
        this.identificado = identificado;
        this.estado = estado;
    }

    public String getIdentificado() {
        return identificado;
    }

    public String getEstado() {
        return estado;
    }

    public void prestar() {
        if (estado.equals("Disponible")) {
            estado = "Prestado";
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro no está disponible para prestar.");
        }
    }

    public void devolver() {
        if (estado.equals("Prestado")) {
            estado = "Disponible";
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro no está prestado.");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author DAW-B
 */
public class Reserva {
    private String fechaEntrada, fechaSalida, tipoReserva;

    public Reserva(String fechaEntrada, String fechaSalida, String tipoReserva) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.tipoReserva = tipoReserva;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public String getTipoReserva() {
        return tipoReserva;
    }
    
    public double getPrecioTotal(){
        int diaEntrada = Integer.parseInt(fechaEntrada.substring(0, 3));
        int diaSalida = Integer.parseInt(fechaSalida.substring(0, 3));
        double precioTotal = 0;
        double precioConIva = 0;
        
        int dias = diaSalida - diaEntrada;
        
        if (tipoReserva.equalsIgnoreCase("normal")) {
            precioTotal = 50 * dias;
            precioConIva = precioTotal * 1.21;
        }
        
        if (tipoReserva.equalsIgnoreCase("superior")) {
            
        }
        
        return precioTotal;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Date;

/**
 *
 * @author DAW-B
 */
public class Reserva {
    private LocalDate fechaentrada, fechasalida;
    private String  tiporeserva;



    public Reserva(String fechaEntrada, String fechaSalida, String tipoReserva) throws ParseException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.fechaentrada = LocalDate.parse(fechaEntrada,dtf);
        this.fechasalida =  LocalDate.parse(fechaSalida,dtf);
        this.tiporeserva = tipoReserva;
    }

    public LocalDate getFechaentrada() {
        return fechaentrada;
    }

    public LocalDate getFechasalida() {
        return fechasalida;
    }

    public String getTiporeserva() {
        return tiporeserva;
    }
    
    public long getNumeronoches(){
        return DAYS.between(this.fechaentrada, this.fechasalida);
    }
    
    public double getPrecioconiva(){
        return getPreciototal() * 1.21;
    }
    
    public double getPreciototal(){
        
        
        double precioTotal = 0;
        
        long dias = DAYS.between(this.fechaentrada, this.fechasalida);
        
        if (this.tiporeserva.equalsIgnoreCase("normal")) {
            precioTotal = 50 * (dias);
        }
        
        if (this.tiporeserva.equalsIgnoreCase("superior")) {
            precioTotal = 75 * (dias);
        }
        
        return precioTotal;
    }
    
}

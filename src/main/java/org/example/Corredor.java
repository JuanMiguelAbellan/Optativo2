package org.example;

import java.time.LocalDate;
import java.util.Comparator;

public class Corredor extends Atleta implements Comparator<Corredor> {

    private  int distancia;
    private double mejorTiempo;
    private double velocidadMaxima;
    private int sesionesEntrenamiento;

    public Corredor(String nombre, LocalDate fechaNacimieto, Pais pais, int distancia) {
        super(nombre, fechaNacimieto, pais);
        this.distancia=distancia;
    }


    @Override
    public void competir() {

    }

    @Override
    public void entrenar() {
        if((Math.random()*5)+1 > 3){
            this.velocidadMaxima+=0.5;
        }
        this.sesionesEntrenamiento++;
    }

    @Override
    public double obtenerPuntuacion() {
        return mejorTiempo;
    }

    public void setMejorTiempo(double mejorTiempo) {
        this.mejorTiempo = mejorTiempo;
    }

    public void setSesionesEntrenamiento(int sesionesEntrenamiento) {
        this.sesionesEntrenamiento = sesionesEntrenamiento;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getMejorTiempo() {
        return mejorTiempo;
    }

    @Override
    public int compare(Corredor corredor1, Corredor corredor2) {
        return (int)(corredor1.getMejorTiempo()*100-corredor2.getMejorTiempo()*100);
    }
}

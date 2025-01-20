package org.example;

import java.time.LocalDate;

public class Corredor extends Atleta{

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

    }

    @Override
    public double obtenerPuntuacion() {
        return 0;
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
}

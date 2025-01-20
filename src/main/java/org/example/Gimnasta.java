package org.example;

import java.time.LocalDate;

public class Gimnasta extends Atleta{
    private double puntuacionMaxima;
    private String especialidad;
    private double dificultadRutina;

    public Gimnasta(String nombre, LocalDate fechaNacimieto, Pais pais, double dificultadRutina) {
        super(nombre, fechaNacimieto, pais);
        this.especialidad="gimnasta";
        this.dificultadRutina=dificultadRutina;
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

    public void setPuntuacionMaxima(double puntuacionMaxima) {
        this.puntuacionMaxima = puntuacionMaxima;
    }
}

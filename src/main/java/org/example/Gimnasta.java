package org.example;

import java.time.LocalDate;
import java.util.Comparator;

public class Gimnasta extends Atleta implements Comparator<Gimnasta> {
    private double puntuacionMaxima;
    private EspecialidadGimnasia especialidad;
    private double dificultadRutina;

    public Gimnasta(String nombre, LocalDate fechaNacimieto, Pais pais, double dificultadRutina, EspecialidadGimnasia especialidad) {
        super(nombre, fechaNacimieto, pais);
        this.especialidad=especialidad;
        this.dificultadRutina=dificultadRutina;
    }

    @Override
    public void competir() {

    }

    @Override
    public void entrenar() {
        if((Math.random()*7)+1 > 4){
            this.puntuacionMaxima+=0.5;
        }
    }

    @Override
    public double obtenerPuntuacion() {
        return puntuacionMaxima;
    }

    public double getPuntuacionMaxima() {
        return puntuacionMaxima;
    }

    public void setPuntuacionMaxima(double puntuacionMaxima) {
        this.puntuacionMaxima = puntuacionMaxima;
    }

    @Override
    public int compare(Gimnasta gimnasta1, Gimnasta gimnasta2){
        return (int)(gimnasta1.getPuntuacionMaxima()*100-gimnasta2.getPuntuacionMaxima()*100);
    }
}

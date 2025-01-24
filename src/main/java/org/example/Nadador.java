package org.example;

import java.time.LocalDate;
import java.util.Comparator;

public class Nadador extends Atleta implements Comparator<Nadador> {

    private EstiloNatacion estilo;
    private double mejorTiempo;

    public Nadador(String nombre, LocalDate fechaNacimieto, Pais pais, EstiloNatacion estilo) {
        super(nombre, fechaNacimieto, pais);
        this.estilo=estilo;
    }

    @Override
    public void competir() {
        
    }

    @Override
    public void entrenar() {
        if((Math.random()*6)+1 > 3){
            this.mejorTiempo+=0.4;
        }
    }

    @Override
    public double obtenerPuntuacion() {
        return mejorTiempo;
    }

    public void setMejorTiempo(double mejorTiempo) {
        this.mejorTiempo = mejorTiempo;
    }

    public double getMejorTiempo() {
        return mejorTiempo;
    }

    @Override
    public int compare(Nadador nadador1, Nadador nadador2) {
        return (int) (nadador1.getMejorTiempo()*100- nadador2.getMejorTiempo()*100);
    }
}

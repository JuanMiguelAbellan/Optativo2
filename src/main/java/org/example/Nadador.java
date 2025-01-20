package org.example;

import java.time.LocalDate;

public class Nadador extends Atleta{

    private String estilo;
    private double mejorTiempo;

    public Nadador(String nombre, LocalDate fechaNacimieto, Pais pais) {
        super(nombre, fechaNacimieto, pais);
        this.estilo="Natacion";
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
    
}

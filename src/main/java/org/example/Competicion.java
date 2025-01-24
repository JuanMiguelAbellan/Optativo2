package org.example;

import java.util.ArrayList;
import java.util.List;

public class Competicion {
    private String nombre;
    private List<Atleta> listaAtletas;
    private int capacidadMaxima;

    public Competicion(String nombreCompeticion, int capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
        this.nombre=nombreCompeticion;
        this.listaAtletas=new ArrayList<Atleta>();
    }
    public void agregarAtleta(Atleta atleta){
        if(comprobarCapacidad())
            listaAtletas.add(atleta);
    }
    public void agregarVariosAtletas(List<Atleta> listaAtletas){
        for(Atleta a: listaAtletas){
            if (comprobarCapacidad())
                this.listaAtletas.add(a);
        }
    }
    public boolean comprobarCapacidad(){
        return capacidadMaxima >= 0;
    }

}

package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Competicion {
    private String nombre;
    private ArrayList<Atleta> listaAtletas;
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
    public void agregarVariosAtletas(List<Atleta> listaAtletas) throws Exception {
        for(Atleta a: listaAtletas){
            if (comprobarCapacidad())
                this.listaAtletas.add(a);
            else
                throw new CompeticionLlenaException("Competicion llena");
        }
    }
    public boolean comprobarCapacidad(){
        return capacidadMaxima >= 0;
    }
    public void simularCompeticion(){
        System.out.println("3...2...1.¡PUM!");
    }
    public Atleta determinarGanador() throws Exception{
        if (listaAtletas.isEmpty())
            throw new CompeticionSinAtletasException("Competicion sin atletas");
        Collections.sort(listaAtletas, Collections.reverseOrder());
        return listaAtletas.getFirst();
    }
    public ArrayList<Atleta> calcularResultados(){
        Collections.sort(listaAtletas, Collections.reverseOrder());
        return listaAtletas;
    }

    public String getNombre() {
        return nombre;
    }
    public List<Atleta> getAtletas() {
        return listaAtletas;
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
}

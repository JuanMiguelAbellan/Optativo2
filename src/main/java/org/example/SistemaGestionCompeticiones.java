package org.example;

import java.util.ArrayList;
import java.util.List;

public class SistemaGestionCompeticiones {
    private ArrayList<Competicion> competiciones=new ArrayList<>();

    public void agregarCompetencia(Competicion competicion){
        competiciones.add(competicion);
    }
    public ArrayList<Competicion> listarCompeticiones(){
        return competiciones;
    }
    public Competicion buscarCompeticion(String nombre){
        for(Competicion e:competiciones){
            if(e.getNombre()==nombre)
                return e;
        }
        return null;
    }
    public void simularTodasLasCompeticiones(){
        for(Competicion e: competiciones){
            e.simularCompeticion();
        }
    }
}

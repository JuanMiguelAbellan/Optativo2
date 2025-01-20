package org.example;

import java.time.LocalDate;

public abstract class Atleta implements Competidor{

    private String nombre;
    private LocalDate fechaNacimieto;
    private Pais pais;
    private int edad;

    public Atleta(String nombre, LocalDate fechaNacimieto, Pais pais) {
        this.nombre = nombre;
        this.fechaNacimieto = fechaNacimieto;
        this.pais = pais;
        this.edad=getEdad();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad(){
        return (LocalDate.now().compareTo(fechaNacimieto));
    }
    public void setEdad(int Edad){
        this.edad=edad;
    }
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
}

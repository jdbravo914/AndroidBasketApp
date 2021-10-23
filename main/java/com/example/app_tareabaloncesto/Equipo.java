package com.example.app_tareabaloncesto;

import java.io.Serializable;

public class Equipo implements Serializable
{
    private String name;
    private int puntosE;

    public Equipo(String name, int puntosE){
        this.name=name;
        this.puntosE=0;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getPuntos() {
        return puntosE;
    }
    public void setPuntos(int puntos) {
        this.puntosE = puntosE;
    }
    public void setPuntos1() {
        this.puntosE = this.puntosE+1;
    }
    public void setPuntos2() {
        this.puntosE = this.puntosE+2;
    }
    public void setPuntos3() {
        this.puntosE = this.puntosE+3;
    }
    public void setReinicio() {
        this.puntosE = 0;
    }


}

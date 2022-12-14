package mundial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Partido>partidosJugados;
    private int puntos;
    public int sumaPuntos;

    Equipo(){

    }
    public Equipo(String nombre){
        this.setNombre(nombre);

    }

    public void sumarPunto(){
       this.setPuntos(3);
        sumaPuntos=puntos+sumaPuntos;
        this.setPuntos(sumaPuntos);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}

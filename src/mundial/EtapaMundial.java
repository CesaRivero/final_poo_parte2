package mundial;

import java.util.ArrayList;
public class EtapaMundial {
    private String descripcionEtapa;
    private  ArrayList<Partido> listaDePartidos;
    public ArrayList<Equipo>equiposQueAvanzan;

    public EtapaMundial() {
        this.listaDePartidos=new ArrayList<Partido>();
        this.equiposQueAvanzan=new ArrayList<Equipo>();
    }

    public ArrayList<Partido> agregarPartido( Partido listaDePartidos){
        this.listaDePartidos.add(listaDePartidos);
        return this.listaDePartidos;

    }
    public ArrayList<Equipo> getEquiposQueAvanzan(){


        return equiposQueAvanzan;
}

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    public ArrayList<Partido> getListaDePartidos() {
        return listaDePartidos;
    }

    public void setListaDePartidos(ArrayList<Partido> listadePartidos) {
        this.listaDePartidos = listadePartidos;
    }
}

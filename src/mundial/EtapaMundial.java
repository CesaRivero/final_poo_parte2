package mundial;

import java.util.ArrayList;
public class EtapaMundial {
    private String descripcionEtapa;
    private  ArrayList<Partido> listaDePartidos;
    private ArrayList<Equipo>equiposQueAvanzan;

    public EtapaMundial() {
        this.listaDePartidos=new ArrayList<Partido>();
        this.equiposQueAvanzan=new ArrayList<Equipo>();
    }

    public ArrayList<Partido> agregarPartido( Partido listaDePartidos){
        this.listaDePartidos.add(listaDePartidos);
        return this.listaDePartidos;

    }
    public ArrayList<Equipo> getEquiposQueAvanzan(){
        for (int i = 0; i <listaDePartidos.size() ; i++) {
            if (getListaDePartidos().get(i).getResultado().ganoLocal()){
                this.equiposQueAvanzan.add(getListaDePartidos().get(i).getLocal());
            }else this.equiposQueAvanzan.add(getListaDePartidos().get(i).getVisitante());

        }

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

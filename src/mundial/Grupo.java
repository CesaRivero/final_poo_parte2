package mundial;

import java.util.ArrayList;
import java.util.Date;

public class Grupo extends EtapaMundial{

    public void generarPartidos(ArrayList<Equipo>equipos){
        // for dentro de for para recorrer partidos de grupos funciona
        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i+1; j <equipos.size() ; j++) {
                getListaDePartidos().add(new Partido(equipos.get(i),equipos.get(j),new Date()));

            }

        }
    }
    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {


        for (int i = 0; i <getListaDePartidos().size() ; i++) {
            if (getListaDePartidos().get(i).getResultado().ganoLocal()){
                getListaDePartidos().get(i).getLocal().sumarPunto();
                //falta ordenar los puntos
                //this.equiposQueAvanzan.add(getListaDePartidos().get(i).getLocal());
            }else getListaDePartidos().get(i).getVisitante().sumarPunto();
                //primer for recorre los partidos y da los puntos a los ganadores
            if (getListaDePartidos().get(i).getLocal().getPuntos()>=6){
                this.equiposQueAvanzan.add(getListaDePartidos().get(i).getLocal());
            } else if (getListaDePartidos().get(i).getVisitante().getPuntos()>=6) {
                this.equiposQueAvanzan.add(getListaDePartidos().get(i).getVisitante());

            }


        }
       /* for (int j = 0; j <getListaDePartidos().size(); j++) {//este segundo for guarda los equipos con puntaje mayor a 4


        }*/
        return equiposQueAvanzan;
    }
    public Grupo(){
        this.setDescripcionEtapa("Fase de Grupos");
    }
}

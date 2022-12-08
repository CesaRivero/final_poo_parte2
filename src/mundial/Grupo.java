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

        equiposQueAvanzan;
        for (int i = 0; i <getListaDePartidos().size() ; i++) {
            if (getListaDePartidos().get(i).getResultado().ganoLocal()){
                this.equiposQueAvanzan.add(getListaDePartidos().get(i).getLocal());
            }else this.equiposQueAvanzan.add(getListaDePartidos().get(i).getVisitante());

        }
        return equiposQueAvanzan;
    }
    public Grupo(){
        this.setDescripcionEtapa("Fase de Grupos");
    }
}

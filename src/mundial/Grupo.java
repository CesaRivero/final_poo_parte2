package mundial;

import java.util.ArrayList;
import java.util.Date;

public class Grupo extends EtapaMundial{

    public void generarPartidos(ArrayList<Equipo>equipos){
        for (int i = 0; i <equipos.size()+1 ; i++) {
            getListaDePartidos().add(new Partido(equipos.get(i),equipos.get(i+1),new Date()));


                    /*0-1
                    0-2
                    0-3
                    2-1
                    3-1
                    2-3*/

        }
    }
    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {

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

package mundial;

import java.util.ArrayList;
import java.util.Date;

public class Llave extends EtapaMundial{

    public void generarPartidos(ArrayList<Equipo>equipos){
        for (int i = 0; i <equipos.size()-1 ; i+=2) {
            getListaDePartidos().add(new Partido(equipos.get(i),equipos.get(i+1),new Date()));

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
}

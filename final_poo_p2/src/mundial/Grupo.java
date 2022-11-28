package mundial;

import java.util.ArrayList;

public class Grupo extends EtapaMundial{
    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return super.getEquiposQueAvanzan();
    }
    public Grupo(){
        this.setDescripcionEtapa("Fase de Grupos");
    }
}

import mundial.Equipo;
import mundial.Partido;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Equipo equipo1=new Equipo("Profesores");
        Equipo equipo2=new Equipo("Alumnos");
        Partido partido1=new Partido(equipo1,equipo2, new Date(22,10,22));

        System.out.println("Hello world!");
    }
}
import garage.*;
import mundial.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Equipo equipo1=new Equipo("Profesores");
        Equipo equipo2=new Equipo("Alumnos");
        Equipo equipo3=new Equipo("Salchipapas");
        Equipo equipo4=new Equipo("Davinci");
        Equipo equipo5=new Equipo("LoPibes");
        Equipo equipo6=new Equipo("Bokita");

        Partido partido1=new Partido(equipo1,equipo2, new Date(22,10,22));
        Partido partido2=new Partido(equipo3,equipo4,new Date(22,10,22));
        Partido semi1=new Partido();
        Partido semi2=new Partido();


        EtapaMundial grupo1=new Grupo();
        EtapaMundial grupo2=new Grupo();

        grupo1.agregarPartido(partido1);
        // partido1.getResultado().setGolesLocal(2);
       // grupo1.getEquiposQueAvanzan();     // 4 equipos -> 2 partidos

        Llave semiFinal1=new Llave();
        Llave semiFinal2=new Llave();
        semiFinal1.agregarPartido(semi1);
        semiFinal2.agregarPartido(semi2);
        ArrayList<Equipo> semifinalistas = new ArrayList<Equipo>();
        semifinalistas.add(equipo5);
        semifinalistas.add(equipo6);
        semifinalistas.add(equipo4);
        semifinalistas.add(equipo3);

        semi1.setLocal(equipo5);
        semi1.setVisitante(equipo6);
        semi2.setLocal(equipo3);
        semi2.setVisitante(equipo4);
        semi1.hacerGol(5,2);
        semi2.hacerGol(1,3);

        ArrayList<Equipo> finalistas = new ArrayList<Equipo>();
        finalistas.add(equipo5);
        finalistas.add(equipo6);
//creo partido y le seteo equipos y fecha
        Partido partidoFinal=new Partido();
        partidoFinal.setLocal(finalistas.get(0));
        partidoFinal.setVisitante(finalistas.get(1));
        partidoFinal.setFecha(new Date(22,11,18));

// creo la etapa del mundial, en este caso es la final

        Llave finalMundial = new Llave();
        finalMundial.agregarPartido(partidoFinal);
        partidoFinal.hacerGol(2,1);
        //creo el array donde guardo los equipos que avanzan, en este caso solo avanza uno
        ArrayList<Equipo> ganador = finalMundial.getEquiposQueAvanzan(); // 2 equipos -> 1 partido


        partido1.hacerGol(1,2);
        partido2.hacerGol(1,5);
        if(partido1.getResultado().ganoLocal()) {
            System.out.println("Gano local");
        }else if(partido1.getResultado().empate()){
            System.out.println("Empataron estos muertos ");
        } else System.out.println("Gano Visitante");

        //partido1.getLocal().

        System.out.println("\n-------\n");

        Garage garage1=new Garage(2,100);
        Auto auto1=new Auto("Renault","Logan",40000,4,5);
        Moto moto1=new Moto("BMW","800",2,110,100);
        Auto auto2=new Auto("Renault","Sandero",40000,4,5);
        garage1.agregarVehiculo(auto1);
        garage1.agregarVehiculo(moto1);

        garage1.agregarVehiculo(auto2);




        System.out.println(String.format("Esta lleno? %b\nCapacidad actual: %s\nKilometraje medio:%f\nPrecio todal de cambio de ruedas:%f",garage1.estaLleno(), garage1.getVehiculos().size(),garage1.calculoKilometrajeMedio(),garage1.valorTotalCambioRueda()));
    }
    }

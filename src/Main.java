import garage.*;
import mundial.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<Equipo>equiposGrupoA= new ArrayList<Equipo>();
        equiposGrupoA.add(new Equipo("Profesores"));
        equiposGrupoA.add(new Equipo("Salchipapas"));
        equiposGrupoA.add(new Equipo("Davinci"));
        equiposGrupoA.add(new Equipo("LoPibes"));


        ArrayList<Equipo>equiposGrupoB =new ArrayList<Equipo>();
        equiposGrupoB.add(new Equipo("Bokita"));
        equiposGrupoB.add(new Equipo("Alumnos"));
        equiposGrupoB.add(new Equipo("Profesores1"));
        equiposGrupoB.add(new Equipo("Profesores2"));


        Grupo grupoA = new Grupo();
        grupoA.generarPartidos(equiposGrupoA);

        System.out.println( grupoA.getListaDePartidos() );
        Grupo grupoB = new Grupo();
        grupoB.generarPartidos(equiposGrupoB);
        grupoB.getListaDePartidos().get(0).hacerGol(2,1);
        grupoB.getListaDePartidos().get(1).hacerGol(4,6);
        grupoB.getListaDePartidos().get(2).hacerGol(3,1);
        grupoB.getListaDePartidos().get(3).hacerGol(2,1);



        ArrayList<Equipo> clasificadosOctavos = new ArrayList<Equipo>();
        clasificadosOctavos.addAll(grupoA.getEquiposQueAvanzan());




        Llave octavos = new Llave();
        octavos.generarPartidos(clasificadosOctavos);
        ArrayList<Equipo> clasificadosCuartos = octavos.getEquiposQueAvanzan();

        Llave cuartos = new Llave();
        cuartos.generarPartidos(clasificadosCuartos);
        ArrayList<Equipo> clasificadosSemis = cuartos.getEquiposQueAvanzan();

        Llave semis = new Llave();
        semis.generarPartidos(clasificadosSemis);
        semis.getListaDePartidos().get(0).hacerGol(2, 1);
        semis.getListaDePartidos().get(1).hacerGol(2, 1);
        ArrayList<Equipo> finalistas = semis.getEquiposQueAvanzan();

        Llave finalMundial = new Llave();
        finalMundial.generarPartidos(finalistas);
        ArrayList<Equipo>ganador=finalMundial.getEquiposQueAvanzan();



       /* partido1.hacerGol(1,2);
        partido2.hacerGol(1,5);
        if(partido1.getResultado().ganoLocal()) {
            System.out.println("Gano local");
        }else if(partido1.getResultado().empate()){
            System.out.println("Empataron estos muertos ");
        } else System.out.println("Gano Visitante");

        //partido1.getLocal().*/

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

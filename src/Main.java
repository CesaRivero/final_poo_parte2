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

        ArrayList<Equipo>equiposGrupoC =new ArrayList<Equipo>();
        equiposGrupoC.add(new Equipo("equipos9"));
        equiposGrupoC.add(new Equipo("equipo10"));
        equiposGrupoC.add(new Equipo("Profesores10"));
        equiposGrupoC.add(new Equipo("Profesores20"));

        ArrayList<Equipo>equiposGrupoD =new ArrayList<Equipo>();
        equiposGrupoD.add(new Equipo("Bokita22"));
        equiposGrupoD.add(new Equipo("Alumnos333"));
        equiposGrupoD.add(new Equipo("Profesores144"));
        equiposGrupoD.add(new Equipo("Profesores233"));

        ArrayList<Equipo>equiposGrupoE =new ArrayList<Equipo>();
        equiposGrupoE.add(new Equipo("Bokita3332"));
        equiposGrupoE.add(new Equipo("Alumnos1212"));
        equiposGrupoE.add(new Equipo("Profesores13"));
        equiposGrupoE.add(new Equipo("Profesores244"));

        ArrayList<Equipo>equiposGrupoF =new ArrayList<Equipo>();
        equiposGrupoF.add(new Equipo("Bokiffdta"));
        equiposGrupoF.add(new Equipo("Alumno132s"));
        equiposGrupoF.add(new Equipo("Profeffsores1"));
        equiposGrupoF.add(new Equipo("Profeffsores2"));

        ArrayList<Equipo>equiposGrupoG =new ArrayList<Equipo>();
        equiposGrupoG.add(new Equipo("Bokwwwita"));
        equiposGrupoG.add(new Equipo("Alueewmnos"));
        equiposGrupoG.add(new Equipo("Profesowwwwres1"));
        equiposGrupoG.add(new Equipo("Profesoeefefres2"));

        ArrayList<Equipo>equiposGrupoH =new ArrayList<Equipo>();
        equiposGrupoH.add(new Equipo("Bokibbbta"));
        equiposGrupoH.add(new Equipo("Alumrrenos"));
        equiposGrupoH.add(new Equipo("Profeggddsores1"));
        equiposGrupoH.add(new Equipo("Profesoaaares2"));



        Grupo grupoA = new Grupo();
        grupoA.generarPartidos(equiposGrupoA);
        /*for (int i = 0; i <grupoA.getListaDePartidos().size(); i++) {
            grupoA.getListaDePartidos().get(i).hacerGol((int) (Math.random()*4),(int) (Math.random()*3));

        }
        asi puedo optimizar el resultado de los partidos pero hay que limitar que no sea empate y luego modificar la condicion para que avancen de grupo*/
        grupoA.getListaDePartidos().get(0).hacerGol(2,1);
        grupoA.getListaDePartidos().get(1).hacerGol(4,6);
        grupoA.getListaDePartidos().get(2).hacerGol(3,1);
        grupoA.getListaDePartidos().get(3).hacerGol(2,1);
        grupoA.getListaDePartidos().get(4).hacerGol(2,1);
        grupoA.getListaDePartidos().get(5).hacerGol(0,1);

        Grupo grupoB = new Grupo();
        grupoB.generarPartidos(equiposGrupoB);
        grupoB.getListaDePartidos().get(0).hacerGol(2,1);
        grupoB.getListaDePartidos().get(1).hacerGol(4,6);
        grupoB.getListaDePartidos().get(2).hacerGol(3,1);
        grupoB.getListaDePartidos().get(3).hacerGol(2,1);
        grupoB.getListaDePartidos().get(4).hacerGol(2,1);
        grupoB.getListaDePartidos().get(5).hacerGol(0,1);

        Grupo grupoC = new Grupo();
        grupoC.generarPartidos(equiposGrupoC);
        grupoC.getListaDePartidos().get(0).hacerGol(2,1);
        grupoC.getListaDePartidos().get(1).hacerGol(4,6);
        grupoC.getListaDePartidos().get(2).hacerGol(3,1);
        grupoC.getListaDePartidos().get(3).hacerGol(2,1);
        grupoC.getListaDePartidos().get(4).hacerGol(2,1);
        grupoC.getListaDePartidos().get(5).hacerGol(0,1);

        Grupo grupoD = new Grupo();
        grupoD.generarPartidos(equiposGrupoD);
        grupoD.getListaDePartidos().get(0).hacerGol(2,1);
        grupoD.getListaDePartidos().get(1).hacerGol(4,6);
        grupoD.getListaDePartidos().get(2).hacerGol(3,1);
        grupoD.getListaDePartidos().get(3).hacerGol(2,1);
        grupoD.getListaDePartidos().get(4).hacerGol(2,1);
        grupoD.getListaDePartidos().get(5).hacerGol(0,1);

        Grupo grupoE = new Grupo();
        grupoE.generarPartidos(equiposGrupoE);
        grupoE.getListaDePartidos().get(0).hacerGol(2,1);
        grupoE.getListaDePartidos().get(1).hacerGol(4,6);
        grupoE.getListaDePartidos().get(2).hacerGol(3,1);
        grupoE.getListaDePartidos().get(3).hacerGol(2,1);
        grupoE.getListaDePartidos().get(4).hacerGol(2,1);
        grupoE.getListaDePartidos().get(5).hacerGol(0,1);

        Grupo grupoF = new Grupo();
        grupoF.generarPartidos(equiposGrupoF);
        grupoF.getListaDePartidos().get(0).hacerGol(2,1);
        grupoF.getListaDePartidos().get(1).hacerGol(4,6);
        grupoF.getListaDePartidos().get(2).hacerGol(3,1);
        grupoF.getListaDePartidos().get(3).hacerGol(2,1);
        grupoF.getListaDePartidos().get(4).hacerGol(2,1);
        grupoF.getListaDePartidos().get(5).hacerGol(0,1);

        Grupo grupoG = new Grupo();
        grupoG.generarPartidos(equiposGrupoG);
        grupoG.getListaDePartidos().get(0).hacerGol(2,1);
        grupoG.getListaDePartidos().get(1).hacerGol(4,6);
        grupoG.getListaDePartidos().get(2).hacerGol(3,1);
        grupoG.getListaDePartidos().get(3).hacerGol(2,1);
        grupoG.getListaDePartidos().get(4).hacerGol(2,1);
        grupoG.getListaDePartidos().get(5).hacerGol(0,1);

        Grupo grupoH = new Grupo();
        grupoH.generarPartidos(equiposGrupoH);
        grupoH.getListaDePartidos().get(0).hacerGol(2,1);
        grupoH.getListaDePartidos().get(1).hacerGol(4,6);
        grupoH.getListaDePartidos().get(2).hacerGol(3,1);
        grupoH.getListaDePartidos().get(3).hacerGol(2,1);
        grupoH.getListaDePartidos().get(4).hacerGol(2,1);
        grupoH.getListaDePartidos().get(5).hacerGol(0,1);

        ArrayList<Equipo> clasificadosOctavos = new ArrayList<Equipo>();
        clasificadosOctavos.addAll(grupoA.getEquiposQueAvanzan());
        clasificadosOctavos.addAll(grupoB.getEquiposQueAvanzan());
        clasificadosOctavos.addAll(grupoC.getEquiposQueAvanzan());
        clasificadosOctavos.addAll(grupoD.getEquiposQueAvanzan());
        clasificadosOctavos.addAll(grupoE.getEquiposQueAvanzan());
        clasificadosOctavos.addAll(grupoF.getEquiposQueAvanzan());
        clasificadosOctavos.addAll(grupoG.getEquiposQueAvanzan());
        clasificadosOctavos.addAll(grupoH.getEquiposQueAvanzan());

        Llave octavos = new Llave();
        octavos.generarPartidos(clasificadosOctavos);
        octavos.getListaDePartidos().get(0).hacerGol(2,1);
        octavos.getListaDePartidos().get(1).hacerGol(0,1);
        octavos.getListaDePartidos().get(2).hacerGol(2,1);
        octavos.getListaDePartidos().get(3).hacerGol(0,1);
        octavos.getListaDePartidos().get(4).hacerGol(0,1);
        octavos.getListaDePartidos().get(5).hacerGol(2,1);
        octavos.getListaDePartidos().get(6).hacerGol(2,1);
        octavos.getListaDePartidos().get(7).hacerGol(0,1);

        ArrayList<Equipo> clasificadosCuartos = octavos.getEquiposQueAvanzan();

        Llave cuartos = new Llave();
        cuartos.generarPartidos(clasificadosCuartos);
        cuartos.getListaDePartidos().get(0).hacerGol(2,1);
        cuartos.getListaDePartidos().get(1).hacerGol(0,1);
        cuartos.getListaDePartidos().get(2).hacerGol(0,1);
        cuartos.getListaDePartidos().get(3).hacerGol(2,1);

        ArrayList<Equipo> clasificadosSemis = cuartos.getEquiposQueAvanzan();

        Llave semis = new Llave();
        semis.generarPartidos(clasificadosSemis);
        semis.getListaDePartidos().get(0).hacerGol(2, 1);
        semis.getListaDePartidos().get(1).hacerGol(0, 1);
        ArrayList<Equipo> finalistas = semis.getEquiposQueAvanzan();

        Llave finalMundial = new Llave();
        finalMundial.generarPartidos(finalistas);
        finalMundial.getListaDePartidos().get(0).hacerGol(2,1);
        ArrayList<Equipo>ganador=finalMundial.getEquiposQueAvanzan();

        System.out.println(String.format("Ganador: %S",ganador.get(0).getNombre()));

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

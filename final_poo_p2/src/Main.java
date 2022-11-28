import garage.Auto;
import garage.Garage;
import garage.Moto;
import mundial.Equipo;
import mundial.Partido;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Equipo equipo1=new Equipo("Profesores");
        Equipo equipo2=new Equipo("Alumnos");
        Equipo equipo3=new Equipo("Salchipapas");
        Equipo equipo4=new Equipo("Davinci");
        Partido partido1=new Partido(equipo1,equipo2, new Date(22,10,22));
       

        partido1.hacerGol(1,2);
        if(partido1.getResultado().ganoLocal()) {
            System.out.println("Gano local");
        }else if(partido1.getResultado().empate()){
            System.out.println("Empataron estos muertos ");
        } else System.out.println("Gano Visitante");




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

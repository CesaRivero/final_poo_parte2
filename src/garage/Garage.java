package garage;

import java.util.ArrayList;

public class Garage {
    private boolean estaLleno;
    private double precioCambioRueda;
    private int capacidadMaxima;
    private ArrayList<Vehiculo> vehiculos;
    private double kilometrajeMedio;



    public boolean estaLleno() {

        return this.vehiculos.size()>=capacidadMaxima;
    }
    public void agregarVehiculo(Vehiculo vehiculo){
        if (estaLleno()) return ;/*resuelto*/
        this.vehiculos.add(vehiculo);
    }
    public void retirarVehiculo (Vehiculo vehiculo){
        this.vehiculos.remove(vehiculo);
    }

    public Garage(int capacidadMaxima, double precioCambioRueda){
        this.setCapacidadMaxima(capacidadMaxima);
        this.setPrecioCambioRueda(precioCambioRueda);
        this.vehiculos =new ArrayList<Vehiculo>();
       /*this.kilometrajeMedio=this.trasporte.getKilometreaje()/this.getVehiculo().size(); intento de guardar los kilometrajes para sacar la media*/

    }
    public double calculoKilometrajeMedio(){
        double kilometrajeMedio=0;
        //vehiculos.length
        for (int i = 0; i <this.getVehiculos().size() ; i++) {
            //vehiculos[i] -> vehiculos.get(i)
           kilometrajeMedio=kilometrajeMedio+this.getVehiculos().get(i).getKilometreaje();


        }
        return kilometrajeMedio/this.getVehiculos().size();
    }

  public double valorTotalCambioRueda(){ //intento de sumar las ruedas en variables locales
        int ruedaTotal=0;
      for (int i = 0; i <this.getVehiculos().size() ; i++) {
          ruedaTotal=ruedaTotal+this.getVehiculos().get(i).getCantidadRueda();

      }

      return ruedaTotal*precioCambioRueda;
    }


    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public double getPrecioCambioRueda() {
        return precioCambioRueda;
    }

    public void setPrecioCambioRueda(double precioCambioRueda) {
        this.precioCambioRueda = precioCambioRueda;
    }



    public void setEstaLleno(boolean estaLleno) {
        this.estaLleno = estaLleno;
    }


    public double getKilometrajeMedio() {
        return kilometrajeMedio;
    }

    public void setKilometrajeMedio(double kilometrajeMedio) {
        this.kilometrajeMedio = kilometrajeMedio;
    }
}

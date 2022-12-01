package garage;

public class Auto extends Vehiculo {

    private int cantidadPuertas;

    public Auto(String marca, String modelo, double kilometraje, int cantidadRueda, int cantidadPuertas){
        this.setCantidadRueda(cantidadRueda);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setCantidadPuertas(cantidadPuertas);
        this.setKilometreaje(kilometraje);

    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
}

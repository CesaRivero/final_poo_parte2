package garage;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int cantidadRueda, int cilindrada, double kilometraje){
        this.setCantidadRueda(cantidadRueda);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setCilindrada(cilindrada);
        this.setKilometreaje(kilometraje);

    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}

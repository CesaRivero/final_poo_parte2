package garage;

public class Vehiculo {
    private int cantidadRueda;
    private double kilometreaje;
    private String marca;
    private String modelo;

    public int getCantidadRueda() {
        return cantidadRueda;
    }

    public void setCantidadRueda(int cantidadRueda) {
        this.cantidadRueda = cantidadRueda;
    }

    public double getKilometreaje() {
        return kilometreaje;
    }

    public void setKilometreaje(double kilometreaje) {
        this.kilometreaje = kilometreaje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

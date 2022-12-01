package mundial;

public class Resultado {
    private int golesLocal;
    private int goleslVisitante;

    public boolean ganoLocal(){
        return  golesLocal>goleslVisitante;
    }

    public boolean empate(){

            return golesLocal==goleslVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGoleslVisitante() {
        return goleslVisitante;
    }

    public void setGoleslVisitante(int goleslVisitante) {
        this.goleslVisitante = goleslVisitante;
    }
}

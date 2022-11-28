package mundial;

public class Resultado {
    private int golesLocal;
    private int goleslVisitante;

    public boolean ganoLocal(){
        if (golesLocal>goleslVisitante)
            return ganoLocal();

        return false;
    }

    public boolean empate(){
        if (golesLocal==goleslVisitante)
            return empate();

        return false;
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

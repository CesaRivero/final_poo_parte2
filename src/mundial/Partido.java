package mundial;

import java.util.Date;

public class Partido {
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;

    public Partido(){
        this.setResultado(new Resultado());


    }
    public Partido(Equipo local, Equipo visitante, Date fecha,Resultado resultado){
        this.setFecha(fecha);
        this.setLocal(local);
        this.setVisitante(visitante);
        resultado=new Resultado();
        this.setResultado(resultado);

    }
    public Partido(Equipo local, Equipo visitante, Date fecha){
        this.setFecha(fecha);
        this.setLocal(local);
        this.setVisitante(visitante);
        this.setResultado(new Resultado());

    }

    public void hacerGol(int golesLocales, int golesVisitante){
        getResultado().setGoleslVisitante(golesVisitante);
        getResultado().setGolesLocal(golesLocales);

    }
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }
}

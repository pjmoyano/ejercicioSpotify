package alarma;

public class Alarma {

    private int activada; //si es 0 esta apagado si es 1 esta prendido
    private int hora;

    public String sonarAlarma() {
        return "IUUUIUUUUIUUUUU";
    }

    public int getActivada() {
        return activada;
    }

    public void setActivada(int activada) {
        this.activada = activada;
    }

    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

}

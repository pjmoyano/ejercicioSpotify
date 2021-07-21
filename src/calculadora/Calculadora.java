package calculadora;

public class Calculadora {

    private int primerNumero;
    private int segundoNumero;
    private int encendida;
    private char tipoDeOperacion;


    public int realizarSuma() {
        return this.primerNumero + this.segundoNumero;
    }

    public int realizarResta() {
        return this.primerNumero - this.segundoNumero;
    }

    public int realizarMultiplicacion() {
        return this.primerNumero * this.segundoNumero;
    }

    public double realizarDivision() {
        return (double) this.primerNumero / (double) this.segundoNumero;
    }


    public int getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public int getEncendida() {
        return encendida;
    }

    public void setEncendida(int encendida) {
        this.encendida = encendida;
    }

    public char getTipoDeOperacion() {
        return tipoDeOperacion;
    }

    public void setTipoDeOperacion(char tipoDeOperacion) {
        this.tipoDeOperacion = tipoDeOperacion;
    }

}
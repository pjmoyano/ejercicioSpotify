package explicaciones;

//El nombre de las clases comienza siempre en mayuscula
public class ObjetoCualquiera {

    String mensajeDeBienvenida;
    String mensajeDeDespedida;

    //el static dice que es no es del objeto, sino de un mundo paralelo.
    static int contadorDeOjetosCreados;
    //Constructor con/por parametro

    public ObjetoCualquiera(String mensaje) {
        this.mensajeDeBienvenida = mensaje;
        this.contadorDeOjetosCreados++;
    }

    public int cuantosObjetosCree() {
        return this.contadorDeOjetosCreados;
    }


    public String getMensajeDeBienvenida() {
        return mensajeDeBienvenida;
    }

    public void setMensajeDeBienvenida(String mensajeDeBienvenida) {
        this.mensajeDeBienvenida = mensajeDeBienvenida;
    }

    public String getMensajeDeDespedida() {
        return mensajeDeDespedida;
    }

    public void setMensajeDeDespedida(String mensajeDeDespedida) {
        this.mensajeDeDespedida = mensajeDeDespedida;
    }
}

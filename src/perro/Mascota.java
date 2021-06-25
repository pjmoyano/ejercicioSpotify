package perro;

public class Mascota {

    public int alimentado;
    public int limpio;

    public int getAlimentado() {
        return alimentado;
    }

    public void setAlimentado(int alimentado) {
        this.alimentado = alimentado;
    }

    public int getLimpio() {
        return limpio;
    }

    public void setLimpio(int limpio) {
        this.limpio = limpio;
    }

    public void alimentarMascota() {
        if (this.alimentado < 5) {
            System.out.println("Alimentando la mascota");
            this.alimentado++;
        }
    }
    public void lavarMascota() {
        if (this.limpio > 0) {
            System.out.println("Limpiando la mascota");
            this.limpio--;
        }

    }



}


package Nivel2a;

public class Alumno {

    String nombre;
    String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreYApellido() {
        return nombre+" "+apellido;
    }
}

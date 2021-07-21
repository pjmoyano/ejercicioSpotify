package Nivel2;

public class Persona {

    private String nombre;
    private int edad;

    //get se usa para Obtener/devolver/RETORNAR/return
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //set lo usamos para SETEAR/ASIGNAR/DAR VALOR
    public void setNombre(String nombre) {
        this.nombre = nombre; //this significa ESTE es decir que este nombre sea igual al que le estoy pasando
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

package Nivel2a;

public class Materia {

    String nombreDeMateria;
    int nota1;
    int nota2;
    int nota3;

    public int getPromedio() {
        return (nota1+nota2+nota3)/3;
    }

    public String getNombreDeMateria() {
        return nombreDeMateria;
    }

    public void setNombreDeMateria(String nombreDeMateria) {
        this.nombreDeMateria = nombreDeMateria;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

}

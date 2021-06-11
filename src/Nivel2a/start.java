package Nivel2a;

import java.util.Scanner;

public class start {
    /*
        Cree un objeto del tipo Alumno, que contenga Nombre y Apellido y Materia.
        Cada Materia tiene Nombre y tres notas.
        Muestre el mensaje "El alumno X Y, termino la materia Z con el promedio W".

        Por ejemplo:
        El alumno Pepe Moyano, termino la materia Matermaticas con el promedio 7".

        El promedio tiene que ser un metodo/funcion dentro de la clase Materia.
     */
    public static void main(String args[]) {
            Alumno alumno = new Alumno();
            Materia materia = new Materia();

            System.out.println("Ingrese el nombre del alumno:");
            alumno.setNombre(ingresarPalabra());
            System.out.println("Ingrese el apellido del alumno: ");
            alumno.setApellido(ingresarPalabra());
            System.out.println("Ingrese el nombre de la materia:");
            materia.setNombreDeMateria(ingresarPalabra());
            System.out.println("Ingrese la primer nota:");
            materia.setNota1(ingresarNumero());
            System.out.println("Ingrese la segunda nota:");
            materia.setNota2(ingresarNumero());
            System.out.println("Ingrese la tercer nota:");
            materia.setNota3(ingresarNumero());

            System.out.println("El alumno "+alumno.getNombreYApellido() +
                    " termino la materia "+materia.getNombreDeMateria() + " con las notas "+ materia.getNota1()
            +" , "+materia.getNota2()+ " y "+materia.getNota3()+ " con un promedio de " + materia.getPromedio());

    }

    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner (System.in);
        String numero = entradaEscaner.nextLine();
        return  Integer.parseInt(numero);
    }

    public static char ingresarCaracter() {
        Scanner entradaEscaner = new Scanner (System.in);
        String character = entradaEscaner.nextLine();
        return  Character.valueOf(character.charAt(0));
    }

    public static String ingresarPalabra() {
        Scanner entradaEscaner = new Scanner (System.in);
        String character = entradaEscaner.nextLine();
        return  character;
    }
}

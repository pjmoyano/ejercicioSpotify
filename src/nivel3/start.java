package nivel3;

import Nivel2.Persona;

import java.util.Scanner;

public class start {
   /*
    Cree una persona y asignele una edad y un nombre.
    Al final muestre el mensaje "Usted es X y su edad es Y".
    Por ejemplo:
    Usted es Aldo y su edad es 32.
    */
    public static void main(String args[]) {
        Persona ciudadano = new Persona();
        String nombre;
        int edad;

        System.out.println("Ingrese el nombre: ");
        nombre = ingresarPalabra();

        System.out.println("Ingrese la edad: ");
        edad = ingresarNumero();

        ciudadano.setEdad(edad);
        ciudadano.setNombre(nombre);

        System.out.println("Usted es "+ciudadano.getNombre()+" y su edad es "+ ciudadano.getEdad());
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

package Nivel2;

import java.util.Scanner;

public class Ejercicio1 {
    /*
       Solcite que el usuario ingrese su nombre y su edad
       Si su edad es menor a 10 mostrar en pantalla solo su nombre.
       Si su edad es mayor a 10:
        mostrar en pantalla su nombre mas" YA ERES GRANDE" por ejemplo: "EVA YA ERES GRANDE"

       Hacer este ejercicio usando un solo objeto del tipo String el cual se mostrara al final.


     */
    public static void main(String args[]) {
        // Aqui declaro las variables que voy a utilizar e ingreso por teclado si hace falta

        int edad = 0;

        System.out.println("Ingresa tu edad: ");
        edad = ingresarNumero();

        String nombre = "";

        System.out.println("Ingresa tu nombre: ");
        nombre = ingresarPalabra();
        // Aqui agrego la logica

        if (edad < 10) {
            System.out.println(nombre);
        }

        if (edad > 10) {
            nombre = nombre + " ya eres grande.";
            System.out.println(nombre);
        }

        // Aqui  muestro el resultado final

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

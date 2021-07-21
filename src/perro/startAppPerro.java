package perro;

import java.util.Scanner;

public class startAppPerro {

    /*
       Este es un programa para alimentar nuestra mascota.
       Cree un objeto del tipo Mascota con la variable alimentado.
       Si alimentado es menor a 5, quiere decir que el perro tiene hambre, y hay que alimentarlo hasta que este en 5.
       Cada vez que se lo alimenta mostrar el mensaje "Alimentando la mascota". Y cuando llega a 5 mostrar el mensaje
       "su mascota esdta alimentada"
       Al principio del programa ingresar el numero actual de alimentado de la mascota.
       Por ejemplo:
       Que tan alimentado esta su mascota? 2
       Alimentando la mascota
       Alimentando la mascota
       Alimentando la mascota


       Ejemplo 2:
       Que tan alimentado esta su mascota? 5

       Parte 2)
       Le vamos a agregar al programa la funcionalidad de bañar la mascota.
       Para esto la mascota tiene un atributo/propiedad que es el nivel de sucio.
       Al principio ingrese por teclado el nivel de sucio que esta la mascota. Y hay que limpiarla hasta que ese nivel sea 0.

       Por ejempli:
       Que tan sucia esta la mascota? 3
       Limpiando la mascota
       Limpiando la mascota
       Limpiando la mascota
       Su mascota ya esta limpia.

       Ejemplo 2:
       Que tan sucia esta la mascota? 0
       Su mascota ya esta limpia
     */

    public static void main(String args[]) {
        Mascota mascota = new Mascota();
        int opcion = 0;

       do{
           System.out.println("Ingrese la opcion que desea realizar:");
           System.out.println("1 - Alimnetar la mascota");
           System.out.println("2 - Limpiar la mascota");
           System.out.println("3 - Salir");
           opcion = ingresarNumero();

           switch(opcion) {
               case 1:
                   System.out.println("Qué tan alimentada está su mascota del 1 al 5?:  ");
                   mascota.setAlimentado(ingresarNumero());
                   do {
                       mascota.alimentarMascota();
                   } while (mascota.getAlimentado() < 5);
                   System.out.println("Su mascota esta alimentada");
                   break;

               case 2:
                   System.out.println ("Qué tan sucia está su mascota del 0 al 5?:  ");
                   mascota.setLimpio (ingresarNumero());
                   do {
                       mascota.lavarMascota();
                   } while (mascota.getLimpio() > 0);
                   System.out.println("Su mascota esta limpia");
                   break;
           }
       } while (opcion != 3);
    }





    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner(System.in);
        String numero = entradaEscaner.nextLine();
        return Integer.parseInt(numero);
    }

    public static char ingresarCaracter() {
        Scanner entradaEscaner = new Scanner(System.in);
        String character = entradaEscaner.nextLine();
        return Character.valueOf(character.charAt(0));
    }

    public static String ingresarPalabra() {
        Scanner entradaEscaner = new Scanner(System.in);
        String character = entradaEscaner.nextLine();
        return character;
    }
}

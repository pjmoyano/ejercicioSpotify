import java.util.Scanner;

public class Ejercicio4 {
    /*
         Ingrese por teclado diez numero enteros
         Calcule la sumatoria (la suma de todos los numeros)
         Si el resultado es mayor a 100 muestre el mensaje:
         "Haz superado el 100 por ciento"
     */

    public static void main(String args[]) {
        // Aqui declaro las variables que voy a utilizar e ingreso por teclado si hace falta


        // Aqui agrego la logica


        // Aqui  muestro el resultado final
    }

    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner (System.in);
        String numero = entradaEscaner.nextLine();
        return  Integer.parseInt(numero);
    }
}

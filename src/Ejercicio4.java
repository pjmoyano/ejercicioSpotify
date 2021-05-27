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
        int[] numeros = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int resultadoSuma = 0;
        int CantidadNumeros= 10;

        for (int i = 0; i < CantidadNumeros; i++) {
            System.out.println("Ingrese el numero " + i + ":");
            numeros[i] = ingresarNumero();
        }

        // Aqui agrego la logica
        for (int i=0; i<10; i++) {
             resultadoSuma= resultadoSuma + numeros[i];
        }
        if (resultadoSuma > 100) {
            System.out.println("Tu resultado es de: " + resultadoSuma+ " Haz superado el 100 por ciento");
        }
        else if (resultadoSuma < 100) {
            System.out.println("Tu resultado es de: " + resultadoSuma+ " No haz superado el 100 por ciento");
        }


        // Aqui  muestro el resultado final

    }

    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner (System.in);
        String numero = entradaEscaner.nextLine();
        return  Integer.parseInt(numero);
    }
}

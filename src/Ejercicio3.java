import java.util.Scanner;

public class Ejercicio3 {
    /*
         Ingrese por teclado tres numeros enteros a , b y c
         Imprima un mensaje mostrando el mayor de los tres
         "El mayor numero ingresado es X"
         Probar con: 1 , 2 , 3
                    3 , 2 , 1
                    2, 3 ,1
                    2, 1 ,3
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

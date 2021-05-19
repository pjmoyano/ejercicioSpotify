import java.util.Scanner;

public class Ejercicio7 {
    /*
         Ingresar por teclado un numero y calcular la suma de todos los numeros desde 0 hasta el numero ingresado.
         (no me acuerdo el nombre de esto, creo que era factoreo)
         Mostrar el mensaje "El factoreo de X es Y"
         Por ejemplo:
         Ingresamos el numero 10.
         0+1+2+3+4+5+6+7+8+9+10 = 55
         Resultado: "El factoreo de 10 es 55"
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

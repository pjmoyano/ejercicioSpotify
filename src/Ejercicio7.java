import java.util.Scanner;

public class Ejercicio7 {
    /*
        Ingresar por teclado un numero y calcular la suma de todos los numeros desde 0 hasta el numero ingresado.

         Mostrar el mensaje "La sumatoria final de X es Y"
         Por ejemplo:
         Ejemplo 1) Ingresamos el numero 10.
         0+1+2+3+4+5+6+7+8+9+10 = 55
         Resultado: "La sumatoria final de 10 es 55"
         Ejemplo 2) Ingresamos el numero 3
         0+1+2+3 = 6
         Resultado: "La sumatoria final de 3 es 6"
     */

    public static void main(String args[]) {

        // Aqui declaro las variables que voy a utilizar e ingreso por teclado si hace falta

        int  numero;
        int sumatoria = 0;

        System.out.println("Ingrese el numero: ");
        numero = ingresarNumero();

        // Aqui agrego la logica

            if (numero>0); {
                for(int i=1; i<=numero; i++) {
                sumatoria = sumatoria + i;
            }
                System.out.println("La sumatoria final de " +numero+ " es: " +sumatoria);
        }

    }


    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner (System.in);
        String numero = entradaEscaner.nextLine();
        return  Integer.parseInt(numero);
    }
}

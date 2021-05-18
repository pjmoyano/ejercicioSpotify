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

        int a;
        int b;
        int c;

        System.out.println("Ingrese el primer numero: ");
        a = ingresarNumero();
        System.out.println("Ingrese el segundo numero: ");
        b = ingresarNumero();
        System.out.println("Ingrese el segundo numero: ");
        c = ingresarNumero();

        // Aqui agrego la logica

        if (a>b && a>c) {
            System.out.println("el mayor numero es " + a);
        }
        if (b>a && b>c) {
            System.out.println("el mayor numero es " + b);
        }
        if (c>a && c>b) {
            System.out.println("el mayor numero es " + c);
        }
        if (a==b && b==c) {
            System.out.println("todos son el mayor numero");
        }

        // Aqui  muestro el resultado final
    }

    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner (System.in);
        String numero = entradaEscaner.nextLine();
        return  Integer.parseInt(numero);
    }
}

import java.util.Scanner;

public class Ejercicio5 {
    /*
         Ingrese por teclado tres numeros enteros a , b y c
         Imprima un mensaje mostrando el menor de los tres
         "El menor numero ingresado es X"
         Probar con: 1 , 2 , 3
                    3 , 2 , 1
                    2, 3 ,1
                    2, 1 ,3
                    3,3,3
                    -7,6,5

     */

    public static void main(String args[]) {

        // Aqui declaro las variables que voy a utilizar e ingreso por teclado si hace falta
        int a;
        int b;
        int c;
        int menor;
        System.out.println("Ingrese el primer numero: ");
        a = ingresarNumero();
        System.out.println("Ingrese el segundo numero: ");
        b = ingresarNumero();
        System.out.println("Ingrese el primer numero: ");
        c = ingresarNumero();

        // Aqui agrego la logica
        if (a<b) {
            if (a<c) {
                menor = a;
            } else {
                menor = c;
            }
        } else if(b < c) {
            menor = b;
        } else {
            menor = c;
        }

        // Aqui  muestro el resultado final
        System.out.println("el menor numero es " + menor);

    }

    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner (System.in);
        String numero = entradaEscaner.nextLine();
        return  Integer.parseInt(numero);
    }
}

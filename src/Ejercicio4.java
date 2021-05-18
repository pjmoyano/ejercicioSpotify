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
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        int j;
        System.out.println("Ingrese el primer numero: ");
        a = ingresarNumero();
        System.out.println("Ingrese el segundo numero: ");
        b = ingresarNumero();
        System.out.println("Ingrese el primer numero: ");
        c = ingresarNumero();
        System.out.println("Ingrese el segundo numero: ");
        d = ingresarNumero();
        System.out.println("Ingrese el primer numero: ");
        e = ingresarNumero();
        System.out.println("Ingrese el segundo numero: ");
        f = ingresarNumero();
        System.out.println("Ingrese el primer numero: ");
        g = ingresarNumero();
        System.out.println("Ingrese el segundo numero: ");
        h = ingresarNumero();
        System.out.println("Ingrese el primer numero: ");
        i = ingresarNumero();
        System.out.println("Ingrese el segundo numero: ");
        j = ingresarNumero();

        // Aqui agrego la logica
        int resultadoSuma = (a+b+c+d+e+f+g+h+i+j);
        if (resultadoSuma > 100) {
            System.out.println("Haz superado el 100 por ciento");
        }
        else if (resultadoSuma < 100) {
            System.out.println("No haz superado el 100 por ciento");
        }


        // Aqui  muestro el resultado final

    }

    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner (System.in);
        String numero = entradaEscaner.nextLine();
        return  Integer.parseInt(numero);
    }
}

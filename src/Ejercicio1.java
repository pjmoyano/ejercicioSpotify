import java.util.Scanner;

public class Ejercicio1 {
   /*
        Ingrese por teclado dos valores enteros que uno sera base y otro altura que representaran la base y
        la altura de un cuadrado. Calcular el area del cuadrado y mostrarla en pantalla con el mensaje:
        "El cuadrado de base: X y altura: Y tiene un area de X"
        Recuerda que para calcular el area la formula es = base * altura

    */
    public static void main(String args[]) {
        // Aqui declaro las variables que voy a utilizar e ingreso por teclado si hace falta

        int base;
        int altura;

        System.out.println("Ingrese el primer numero: ");
        base = ingresarNumero();
        System.out.println("Ingrese el segundo numero: ");
        altura = ingresarNumero();

        // Aqui agrego la logica

        int area = base * altura;

        // Aqui  muestro el resultado final
        System.out.println("El cuadrado de base:" +base+ " y altura:" +altura+ " tiene un area de "+ base*altura);
    }

    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner (System.in);
        String numero = entradaEscaner.nextLine();
        return  Integer.parseInt(numero);
    }
}

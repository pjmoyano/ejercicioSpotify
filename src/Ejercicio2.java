import java.util.Scanner;

public class Ejercicio2 {
    /*
         Ingrese por teclado dos valores enteros que uno sera base y otro altura que representaran la base y
         la altura de un cuadrado. Calcular el perimetro del cuadrado y mostrarla en pantalla con el mensaje:
         "X"
         Recuerda que para calcular el perimetro la formula es = base * 2 + altura * 2
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
        int perimetro = (base*2)+(altura*2);

        // Aqui  muestro el resultado final
        System.out.println("El cuadrado de base:" +base+ " y altura:" +altura+ " tiene un perimetro de " +perimetro);
    }

    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner (System.in);
        String numero = entradaEscaner.nextLine();
        return  Integer.parseInt(numero);
    }
}

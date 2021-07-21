import java.util.Scanner;

public class Ejercicio4b {
    /*
         Ingrese por teclado diez numero enteros
         Calcule la sumatoria (la suma de todos los numeros)
         Si el resultado es mayor a 100 muestre el mensaje:
         "Haz superado el 100 por ciento"
     */

    public static void main(String args[]) {
        // Aqui declaro las variables que voy a utilizar e ingreso por teclado si hace falta
        int[] numero = { 0,0,0,0,0,0,0,0,0,0};
        int sumatoria = 0;
        //Cuando sabemos que a algo lo tenemos que hacer REPETIDAS VECES usamos el for


        for (int i=0; i<10; i++) {
            System.out.println("Ingrese el numero "+i+":");
            numero[i] = ingresarNumero();
        }

        // Aqui agrego la logica
        for (int i=0; i<10; i++) {
            sumatoria = sumatoria + numero[i];
        }

        // Aqui  muestro el resultado final
        System.out.println("La sumatoria es :"+sumatoria);
    }
/*
    acumulador = acumulador + VARIABLE; //va guardando grandes valores
    contador++; //va contando de a uno

    edadEva = edadEva + 1   ------> edadEva++

    dineroQueTengoEnELBanco = dineroQueTengoEnElBanco + 1000  ----- NO ES LO MISMO --> dineroQueTengoEnElBanco++

  */
    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner (System.in);
        String numero = entradaEscaner.nextLine();
        return  Integer.parseInt(numero);
    }
}

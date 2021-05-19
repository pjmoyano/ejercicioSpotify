import java.util.Scanner;

public class Ejercicio6 {
    /*
         Un alumno tiene 10 materias. Ingrese por teclado los promedios finales de cada una de las materias
         en valores enteros.
         Calcule el promedio del alumno segun sus promedios de cada materia.
         Si el promedio es mayor a 7 muesdtre el mensaje "Tu promedio es X, estas listo para la universidad"
         Si no, que muestre el mensaje "Tu promedio es X, necesitas mejorar antes de ir a la universidad"
         Por ejemplo: 8 , 9, 7 , 8, 9 , 9 ,5 ,8 ,9 , 10
         Resultante: "Tu promedio es 8, estas listo para la universidad"
         Ejemplo 2: 1 , 1 , 1 , 1 , 1 ,1 ,1 ,1 ,1 , 1
         Resultado: "Tu promedio es 1, necesitas mejorar antes de ir a la universidad"
     */

    public static void main(String args[]) {

        // Aqui declaro las variables que voy a utilizar e ingreso por teclado si hace falta

        int[] promedios = { 0,0,0,0,0,0,0,0,0,0};
        int sumatoriaDePromedios = 0;
        int promedioFinal = 10;

        for (int i=0; i<10; i++) {
            System.out.println("Ingrese el numero "+i+":");
            promedios[i] = ingresarNumero();
        }

        // Aqui agrego la logica
        for (int i=0; i<10; i++) {
            sumatoriaDePromedios = sumatoriaDePromedios + promedios[i];
            promedioFinal = sumatoriaDePromedios / 10;
        }
        // Aqui  muestro el resultado final

        if (promedioFinal > 7) {
            System.out.println("Tu promedio es: "+promedioFinal+ " Estas listo para la universidad");
        } else if (promedioFinal < 7) {
            System.out.println("Tu promedio es: "+promedioFinal+ " Necesitas mejorar antes de ir a la universidad");
        }
    }

    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner (System.in);
        String numero = entradaEscaner.nextLine();
        return  Integer.parseInt(numero);
    }
}

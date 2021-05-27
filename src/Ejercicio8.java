import java.util.Scanner;

public class Ejercicio8 {
    /*
        Realizar un programa donde ingrese 12 temperaturas en numeros enteros, correspondientes a cada mes del año.
        Luego mostrar el promedio, la temperatura mas alta y la temperatura mas baja junto al mes que registro dicha temperatura.
       Ejemplo:
       Ingrese la temperatura 0: 36
       Ingrese la temperatura 1: 37
       Ingrese la temperatura 2: 31
       Ingrese la temperatura 3: 26
       Ingrese la temperatura 4: 16
       Ingrese la temperatura 5: 8
       Ingrese la temperatura 6: 2
       Ingrese la temperatura 7: -1
       Ingrese la temperatura 8: 4
       Ingrese la temperatura 9: 15
       Ingrese la temperatura 10: 21
       Ingrese la temperatura 11: 28

       El promedio de temperatura es: 19
       La temperatura mas alta se registro en el mes 1 y es de 37 grados
       La temperatura mas baja se refistro en el mes 7 y es de -1 grados
     */

    public static void main(String args[]) {

        int[] temperaturas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int meses = 12;
        int menorTemperatura = 0;
        int mayorTemperatura = 0;

        for (int i = 0; i < 12; i++) {
            System.out.println("Ingrese la temperatura " + i + ":");
            temperaturas[i] = ingresarNumero();
        }

        menorTemperatura = calcularMenorTemperatura(temperaturas);
        mayorTemperatura = calcularMayorTemperatura(temperaturas);

        System.out.println("La mayor temperatura es: "+mayorTemperatura);
        System.out.println("La menor temperatura es: "+menorTemperatura);
    }

    private static int calcularMayorTemperatura(int[] temperaturas) {
        int mayor = -100;
        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] > mayor) {
                mayor = temperaturas[i];
            }
        }
        return mayor;
    }

    private static int calcularMenorTemperatura(int[] temperaturas) {
        int menor = 100;
        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }
        return menor;
    }

    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner(System.in);
        String numero = entradaEscaner.nextLine();
        return Integer.parseInt(numero);
    }

}

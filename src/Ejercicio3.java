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
                    3,3,3
     */

    public static void main(String args[]) {

        // Aqui declaro las variables que voy a utilizar e ingreso por teclado si hace falta

        int a;
        int b;
        int c;
        int mayor;

        System.out.println("Ingrese el primer numero: ");
        a = ingresarNumero();
        System.out.println("Ingrese el segundo numero: ");
        b = ingresarNumero();
        System.out.println("Ingrese el tercer numero: ");
        c = ingresarNumero();

        // Aqui agrego la logica
        // a=3 b=3 c=2
        mayor = calcularElMayorDeTresNumeros(a,b,c);

        // Aqui  muestro el resultado final
        System.out.println("el mayor numero es " + mayor);

    }

    public static int calcularElMayorDeTresNumeros(int numero1, int numero2, int numero3) {
        if (numero1>numero2) {
            if (numero1>numero3) {
              return numero1;
            } else {
             return numero3;
            }
        } else if(numero2 > numero3) {
            return numero2;
        } else {
            return numero3;
        }
    }

    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner (System.in);
        String numero = entradaEscaner.nextLine();
        return  Integer.parseInt(numero);
    }

    //cuando es void, no espero que devuelva nada, simplemente que haga
    //si no, en vez de void, le digo que es lo que espero que devuelva, por ejemplo: int
    //para devolver utilizamos la palabra reservada return
}

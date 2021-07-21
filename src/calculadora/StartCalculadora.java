package calculadora;

/*
 Realice un programa que muestre el mensaje:
 1 - Realizar operacion
 2 - Salir
 Si introducimos uno podemos realizar cualquier operacion entre dos numeros y mostrar su resultado, pidiendo
 que ingrese el primer numero, el segundo numero y la operacion que quiere realizar.
 Las operaciones posibles son resta - suma + division / y multiplicacion *  y son del tipo caracter (char)
 El usuario puede realizar tantas operaciones como quiera, es decir realizra operaciones hasta que ingrese el numero dos cuando se le pregunte.
 Al final mostrar cuantas operaciones a realizado.

 Para esto vamos a necesitar una clase Calculadora que tenga los atributos primerNumero, segundoNumero
 y los metodos realizarMultiplicacion realizarDivision realizarResta y realizarSuma
 Por ejemplo:
 1 - Realizar operacion
 2 - Salir
 1
 Ingrese el primer numero: 2
 Ingrese el segundo numero: 4
 Ingrese la operacion: *
 El resultado es: 8
 ¿Desa realizar otra operacion? 1 - Si 2 - Salir
 1
 Ingrese el primer numero: 4
 Ingrese el segundo numero: 5
 Ingrese la operacion: -
 El resultado es: -1
 ¿Desa realizar otra operacion? 1 - Si 2 - Salir
 2
 Se han realizado 2 operaciones.
 */

import java.util.Scanner;

public class StartCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora  = new Calculadora();

        System.out.println("Desea realizar una operacion? 1 si, 2 salir: ");
        calculadora.setEncendida(ingresarNumero());

        if  (calculadora.getEncendida() == 1) {

            System.out.println("Ingrese el primer numero: ");
            calculadora.setPrimerNumero(ingresarNumero());

            System.out.println("Ingrese el segundo numero: ");
            calculadora.setSegundoNumero(ingresarNumero());

            System.out.println("Ingrese el tipo de operacion: ");
            calculadora.setTipoDeOperacion(ingresarCaracter());

            System.out.println(
            resolverOperacion(calculadora)
            );
        }
    }

    private static double resolverOperacion (Calculadora casio) {
        double resultado = 0;
        switch (casio.getTipoDeOperacion()){

            case '+':
                resultado = casio.realizarSuma();
                break;
            case '-':
                resultado = casio.realizarResta();
                break;
            case '*':
                resultado = casio.realizarMultiplicacion();
                break;
            case '/':
                resultado = casio.realizarDivision();
                break;
        }
        return resultado;
    }

    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner(System.in);
        String numero = entradaEscaner.nextLine();
        return Integer.parseInt(numero);
    }

    public static char ingresarCaracter() {
        Scanner entradaEscaner = new Scanner(System.in);
        String character = entradaEscaner.nextLine();
        return Character.valueOf(character.charAt(0));
    }

    public static String ingresarPalabra() {
        Scanner entradaEscaner = new Scanner(System.in);
        String character = entradaEscaner.nextLine();
        return character;
    }
}
import java.util.Scanner;

public class application {
    public static void main(String args[]) {

//        System.out.println("***********************************************");
//        System.out.println("EJERCICIO 1");
//        System.out.println("**********************************");
//
//        /*
//        Si la suma de dos numeros da un resultado mayor a 10 mostrar el mensaje "Es mayor a diez"
//        ----------------------------------------------------------------------------*/
//        int a;
//        int b;
//
//        System.out.println("Ingrese el primer numero: ");
//        a = ingresarNumero();
//        System.out.println("Ingrese el segundo numero: ");
//        b = ingresarNumero();
//
//
//        if ((a+b) > 10) {
//            System.out.println("es mayor a 10");
//        }
//
//        System.out.println("***********************************************");
//        System.out.println("EJERCICIO 2");
//        System.out.println("**********************************");
        /*
        Ingrese dos numeros por teclado a y b, si la resta de a-b es menor a 0
        mostrar el mensaje "El resultado es negativo"
        ----------------------------------------------------------------------------*/
//        int a,b, resultadoResta;
//
//        System.out.println("Ingrese el primer numero: ");
//        a = ingresarNumero();
//        System.out.println("Ingrese el segundo numero: ");
//        b = ingresarNumero();
//        resultadoResta = a -b ;
//        if (resultadoResta < 0 ) {
//            System.out.println("el resultado es negativo");
//        }

        System.out.println("***********************************************");
        System.out.println("EJERCICIO 3");
        System.out.println("**********************************");
        /*
        Ingresar dos numeros por teclado que se llamarn a3 y b3, y dividir a3 entre b3.
        Si el resultado es mayor a 1 mostrar el mensaje
        "Hay mas de uno para cada uno", si es menor a uno mostrar "No hay para todos".
        Y si el divisor (b3) es 0
        mostrar "No se puede dividir por 0"
        Probar con 8/4  2/5  5/0
        ----------------------------------------------------------------------------*/
        int a3;
        int b3;

        System.out.println("Ingrese el primer numero: ");
        a3 = ingresarNumero();
        System.out.println("Ingrese el segundo numero: ");
        b3 = ingresarNumero();

        int resultadoDivision = a3 / b3;


        if (resultadoDivision > 1) {
            System.out.println("Hay mas de uno para cada uno");
        }
        if (resultadoDivision < 1) {
            System.out.println("NO hay para todos");
        }
        if (b3 == 0) {
            System.out.println("No se puede dividir por 0");
        }


/*
        int divisor = 0;
        if (divisor == 0) {
            System.out.println("No se puede dividir por 0");
        } else {
            int division = 8 / divisor;
            System.out.println("resultado Division " + division);

            if (division > 1) {
                System.out.println("Hay mas de uno para cada uno");
            }
            if (division < 1) {
                System.out.println("NO hay para todos");
            }
        }

 //       System.out.println("***********************************************");
 //       System.out.println("EJERCICIO 4");
  //      System.out.println("**********************************");
        /*
        Sumar 3 numeros. Si el resultado es mayor 5 mostrar el mensaje "Es mayor a 5", si es mayor a 10 mostrar
        el mensaje es "Es mayor a 10" si es mayor a 20 mostrar "Es el mayor resultado". Si el resultado es negativo
        mostrar el mnesaje "El resultado no puede ser negativo"
        Proarlo con:
        20+5+6
        1+2+3
        10+0+5
        10+5+(-30)
        -------------------------------------------------------------------------- */

  //      int a4;
  //      int b4;
 //       int c4;
//        int resultadoSumaA;

  //      System.out.println("Ingrese el primer numero: ");
 //       a4 = ingresarNumero();
 //       System.out.println("Ingrese el segundo numero: ");
 //       b4 = ingresarNumero();//      System.out.println("Ingrese el tercer numero: ");
//        c4 = ingresarNumero();

//        resultadoSumaA = a4+b4+c4;

 //       if (resultadoSumaA > 20)
//        {
//            System.out.println("es el mayor resultado");
 //       }
 //       else if (resultadoSumaA > 10)
 //       {
 //           System.out.println("es mayor a 10");
//        }
  //      else if (resultadoSumaA > 5) {
//            System.out.println("es mayor a 5");
  //      }
 //       else if (resultadoSumaA < 0) {
 //           System.out.println("El resultado no puede ser negativo");
  //      }


    }

    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner (System.in);
        String numero = entradaEscaner.nextLine();
        return  Integer.parseInt(numero);
     }
}
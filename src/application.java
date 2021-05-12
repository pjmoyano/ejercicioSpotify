public class application {
    public static void main(String args[]) {
        System.out.println("***********************************************");
        System.out.println("EJERCICIO 1");
        System.out.println("**********************************");

        /*
        Si la suma de dos numeros da un resultado mayor a 10 mostrar el mensaje "Es mayor a diez"
        ----------------------------------------------------------------------------*/
        int resultado = 8+3;

        if (resultado > 10) {
            System.out.println("es mayor a 10");
        }

        System.out.println("***********************************************");
        System.out.println("EJERCICIO 2");
        System.out.println("**********************************");


        /*
        Si la resta de dos numeros da un resultado menor a 0 mostrar el mensaje "El resultado es negativo"
        ----------------------------------------------------------------------------*/
        int resultadoResta = 3 - 5;

        if (resultadoResta < 0) {
            System.out.println("el resultado es negativo");
        }

        System.out.println("***********************************************");
        System.out.println("EJERCICIO 3");
        System.out.println("**********************************");
        /*
        Dividir dos numeros y mostrar el resultado. Si el resultado es mayor a 1 mostrar el mensaje
        "Hay mas de uno para cada uno", si es menor a uno mostrar "No hay para todos". Y si el divisor es 0
        mostrar "No se puede dividir por 0"
        ----------------------------------------------------------------------------*/
        int divisor =0;
        if (divisor ==0) {
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


        System.out.println("***********************************************");
        System.out.println("EJERCICIO 4");
        System.out.println("**********************************");
        /*
        Sumar 3 numeros. Si el resultado es mayor 5 mostrar el mensaje "Es mayor a 5", si es mayor a 10 mostrar
        el mensaje es "Es mayor a 10" si es mayor a 20 mostrar "Es el mayor resultado". Si el resultado es negativo
        mostrar el mnesaje "No se puede sumar numeros negativos"
        Proarlo con:
        20+5+6
        1+2+3
        10+0+5
        10+5+(-30)
         */


    }


}
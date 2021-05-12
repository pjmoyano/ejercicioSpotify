public class application {
    public static void main(String args[]) {
 /*
        Si la suma de dos numeros da un resultado mayor a 10 mostrar el mensaje "Es mayor a diez"
        ----------------------------------------------------------------------------*/
        int resultado = 8+3;

        if (resultado > 10) {
            System.out.println("es mayor a 10");
        }

        /*
        Si la resta de dos numeros da un resultado menor a 0 mostrar el mensaje "El resultado es negativo"
        ----------------------------------------------------------------------------*/
        int resultadoResta = 3 - 5;

        if (resultadoResta < 0) {
            System.out.println("el resultado es negativo");
        }

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






    }


}
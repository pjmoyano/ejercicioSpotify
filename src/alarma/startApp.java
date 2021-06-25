package alarma;

import java.util.Scanner;

public class startApp {

    /*
        Este es un programa que esta a medio realizar.
        Una persona como no queria gastar plata en una alarma decidio armarlo el mismo, pero todavia no lo ha terminado.
        Queria realizar un programa en el cual, pueda activar o desactivar la alarma.
        Si la alarma esta activada tiene que sonar cuando se le ingrese un hora entre las 10 de la noche y 6 de la mañana.

        La persona creo la clase alarma con su metodo sonarAlarma y su activar y desactivar pero nunca realizo la implementacion.

        Asegurese de que pueda ingresar un numero, y la alarma si esta activada y la hora sea la correspondiente tenga que sonar.

        Por ejemplo:
        - La alarma esta activada: 0
        - Ingrese un numero de hora: 4
        (no muestra mas nada)
         ---------------------------------------
         Por ejemplo:
        - La alarma esta activada: 1
        - Ingrese un numero de hora: 4
         "IUUUUUIUUUUIUUUUU"
     */
    public static void main(String args[]) {
        Alarma alarma = new Alarma();

        System.out.println("Alarma activada: ");
        alarma.setActivada(ingresarNumero());

        System.out.println("Ingrese una hora: ");
        alarma.setHora(ingresarNumero());

        if (alarma.getActivada() == 1) {
            //aca sabemos que la alarma esta activada
            if (alarma.getHora() >= 22 || alarma.getHora() <= 6) {
                    System.out.println(alarma.sonarAlarma());
            }
        }
        //aca esta desactivada, y cuando esta desactivada no queremos hacer nada

    }

    public static int ingresarNumero() {
        Scanner entradaEscaner = new Scanner (System.in);
        String numero = entradaEscaner.nextLine();
        return  Integer.parseInt(numero);
    }

    public static char ingresarCaracter() {
        Scanner entradaEscaner = new Scanner (System.in);
        String character = entradaEscaner.nextLine();
        return  Character.valueOf(character.charAt(0));
    }

    public static String ingresarPalabra() {
        Scanner entradaEscaner = new Scanner (System.in);
        String character = entradaEscaner.nextLine();
        return  character;
    }
}

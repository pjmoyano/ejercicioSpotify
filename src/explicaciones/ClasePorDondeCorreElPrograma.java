package explicaciones;

import java.util.Scanner;

public class ClasePorDondeCorreElPrograma {

    //Todos los programas tienen su public static void main como este que es por donde arranca.
    public static void main(String args[]) {

        //es comun crear un objeto que se llame igual a la clase pero en minuscula.
        ObjetoCualquiera objetoCualquiera = new ObjetoCualquiera("BIENVENIDO AL MUNDO DE LA PROGRAMACION");
        System.out.println(
                mostrarMensajeAlRevez(objetoCualquiera)
        );

        ObjetoCualquiera unOjetoDiferente = new ObjetoCualquiera("HOLA PEPE");
        unOjetoDiferente.setMensajeDeBienvenida("HOLA EVA");
        System.out.println(
                mostrarMensajeAlRevez(unOjetoDiferente)
        );

        System.out.println("Hemos creado esta cantidad de objetos: "+ unOjetoDiferente.cuantosObjetosCree());
    }
    //metodo sin parametro
    private static int unMetodoQueMeDevuelveUnEnetro() {
       return 1;
    }
    //metodo por parametro (entre parentesis expecificamos que esperamos que nos llegue
    private static int unMetodoQueMeDevuelveElNumeroQueRecibeMasUno(int numeroQueRecibo) {
        return numeroQueRecibo+1;
    }

    //ejemplo de metodo por parametro que recibe como parametro un Objeto
    private static String mostrarMensajeAlRevez(ObjetoCualquiera ob) {
        String prueba = "";
        for (int i = ob.getMensajeDeBienvenida().length()-1 ; i >= 0 ; i--) {
            prueba = prueba + ob.getMensajeDeBienvenida().charAt(i);
        }
        return prueba;
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

public class Anotaciones {
    //Todo codigo funciona a travez de un public static void main(String args[])
    public static void main(String args[]) {

        //Tenemos variables primitivas - solo son eso y nada mas. No tienen funciones propias

        int edad = 0; //numeros enteros
        char sexo = 'F'; //caracteres van entre comillas simples
        double numeroConComa = 0.0; //numero con punto


        //Tenemos Objetos - Cuando creamos un objeto viene con distintos valores o propiedades definidos en la clase
        //a  la que pertence

        //Objeto String
        String cadenaDeTexto = "Hola Eva"; //Un objeto String adentro guarda un Array [] de chars, y junta todos los chars para formar una cadena

        //Tiene funciones o funciones propias que son por ejemplo:
        //length
        System.out.println(cadenaDeTexto.length()); //el length devuelve un numero entero que representa cuantos chars tiene

        //contains: devuelve true o false si contiene lo que le pasamos entre parentesis
        System.out.println(cadenaDeTexto.contains("Hola")); // muestra true porque Hola esta dentro de la cadena de texto
        System.out.println(cadenaDeTexto.contains("Chau")); // muestra false porque Chau no esta en la cadena de texto

        //al String lo puedo ir haciendo crecer por ejemplo:
        cadenaDeTexto = cadenaDeTexto + " como estas?";
        System.out.println(cadenaDeTexto);
        cadenaDeTexto = cadenaDeTexto + " Yo estoy bien";
        System.out.println(cadenaDeTexto);
        cadenaDeTexto = "No queda nada";
        System.out.println(cadenaDeTexto);

    }
}

public class application {
    public static void main(String args[]) {
        //Propiedades de la canciones

        int duracion[] = {233, 254, 320, 212, 222}; //Creamos un Array que se llama duracion que va a guardar elementos del tipo int
        int escuchas[] = {0, 0, 0, 0, 0};  //creamos un array que se llama escuchas que va a guardar elementos del tipo int


        //Reglas de Spotify
        short cantidadNecesariaSeg = 30; //Creamos un variable del tipo short que se llama cantidadNecesariaSeg y le asignamos el valor 30

        //Oyente
        int usandoSpotifySegundos = 0; //Creamos una variable del tipo int que se llama usandoSpotifySegundos y le asignamos el valor 0


        //LOGICA
/*
== es igual?
!= es diferente?
> es mayor? >= es mayor o igual?
< es menor? <= es menor o igual ?
 */

        /*
        Este For creo un bucle que se va a ejecutar mil veces porque empieza
        con i igual a 0, i aumentando de a uno (i++) y lo hace mientras que i sea menor a 1000
         */

        for (int i = 0; i < 1000; i++) {  //for (desde; hasta; y como aumentos)
            //Math es una libreria que contiene el metodo random que nos devuelve un numero double, por eso usamos (int), ya que lo queremos guardar en una variable del tipo int
            int numeroDeLaCancion = (int) (Math.random()*5); //Creo una variable del tipo int que se llama numeroDeLaCancion y le asigno un numero random entre 0 y 5
            usandoSpotifySegundos = (int) (Math.random() * 100);
            System.out.println("este escucho la cancion "+ numeroDeLaCancion+" " + usandoSpotifySegundos + " segundos."); //System.out.println lo utilizamos para imprimir en pantalla un mensaje
            if (usandoSpotifySegundos >= cantidadNecesariaSeg) { //Si (usandoSpotifySegundos ES MAYOR O IGUAL A cantidadNecesariaSeg) hacemos lo que esta entre las llaves
                escuchas[numeroDeLaCancion]++; //esto es como un contador, es igual a escuchas[numeroDeLaCancion] = escuchas[numeroDeLaCancion] + 1;
            }

        }

        //Creamos este for que recorre el array de las canciones, mostrando cuantas veces se escucho cada cancion
        for (int i = 0; i < 5; i++) {
            System.out.println("la cancion "+i+" se escucho " + escuchas[i]); //la primera vez i valdra 0, la segunda 1, despues 2, y asi hasta el 4
        }

        //creamos una variable mayorEscuchas para ir guardando el numero de mas escuchas que tenga cualquier cancion
        int mayorEscuchas = 0;


        //creamos una variable para guardar el indice de la cancion mas escuchada
        int cancionMasEscuchada = 0;


        //en este for vamos a recorrer las canciones para saber cual es la mas escuchada
        //y guardar la cantidad de veces mas escuchada y el indicie de la cancion mas escuchada
        for (int i = 0; i < 5; i++) {

            if (escuchas[i] > mayorEscuchas)

            {
                mayorEscuchas = escuchas[i];

                cancionMasEscuchada = i;

            }
        }
        System.out.println("La cancion que se escucho mas veces,es "+cancionMasEscuchada+" se escucho "+mayorEscuchas);



        //TAREA - Mostrar cuantas veces y cual es la cancion que menos veces se escucho
        //muy parecido a lo que hay desde la linea 44
        int menorEscuchas = 1000;
        int cancionMenosEscuchada = 0;

        for (int i = 0; i < 5; i++) {
            if (escuchas[i] < menorEscuchas) {
                menorEscuchas = escuchas[i];
                cancionMenosEscuchada = i;
            }
        }

        System.out.println("La cancion que se escucho menos veces,es "+cancionMenosEscuchada+" se escucho "+menorEscuchas);

    }


}
package ahorcado;
import java.util.Scanner;   
public class Ahorcado{
    public static void  main (String[] args) {
        // scanner para que ingrese las letras//
        Scanner sc =  new Scanner(System.in);
        // las vidas que tiene el jugador
        int vidas = 5;
        // aqui se va almacenar la palabra //
        String palabra;
        //los aciertos y fallas que tiene
        int aciertos = 0, fallas = 0;
        //para capturar  el tamaño de la palabra el numero de letras
        int tamaño;
        // para recibir la  letra que ingrese
        String option;
        // contador para los aciertos
        int contador = 0;
        // un array para alamcenar las palabras
        String [] palabras = new String[] {"ordenador","pantalla","perro","cuadro","mesa","ventana","arboles","cepillo,"};
        //un char para recibir repuestas
        char[]  respuesta;
        // metodo random para selccionar unas de la palabras
        palabra = palabras[(int) (Math.random()* 8) ];
        //para el tamaño de la palabra (numero de letras)
        tamaño = palabra.length();
        //se guarda el nmumero de letras de la palabra en el array que recibe tambien las repuestas correctas (cantidad)
        respuesta = new char[tamaño];
        //para el puntaje del jugador
        int puntaje = 0;
        //para saber si el jugador quiere seguir jugando
        int jugador = 1;

        int letrasfaltantes = tamaño;
        //para dales un valor oculto a cada letra de la palabra
        for (int i = 0; i < tamaño; i++) {
            respuesta[i] = 'x';
        }
        //para que el jugdor ingrese cero y el juego finalice
        while (jugador != 0) {

            while (aciertos < tamaño && vidas > 0) {
                // Mostrar el estado del juego
                System.out.println("======== AHORCADO :) ========  VIDAS=" + vidas + " Aciertos= " + aciertos + " Puntuacion = " + puntaje + " Faltan " + letrasfaltantes + " letras");
                
                // Mostrar el estado del ahorcado
                Ahorcar(vidas);
                
                // Separación visual
                System.out.println("");

                // para imprirmir la  palabra oculta
                for (int i = 0;i < tamaño; i++) {

                    System.out.print("__" + respuesta[i] + "__ ");
                    
                }
                // pedimos al jugador la letra para comenzar
                System.out.println("Ingresa una letra: ");
                option = sc. next();

                // si la letra que ingreso esta en la palabra seleccionada se recorre el array y se asigna un valor contandolo como acierto
                if (palabra.contains(option)) {
                    for (int i = 0; i < tamaño; i++) {
                        if (palabra.charAt(i)==option.charAt(0)) {
                            respuesta[i] = option.charAt(0);
                            contador ++;
                        }
                        
                    }

                    letrasfaltantes= tamaño - contador;

                    aciertos = aciertos + contador;
                    // por cada letra que acierte el jugador obtiene 10 puntos
                    puntaje = puntaje + 10;
                } else {
                    // si la letra no esta contenida en dentro de la palabra restamos una vida
                    vidas--;
                    fallas++;
                    // mosntramos el mensaje de cuantas veces puede volver a fallar
                    System.out.println("Vaya! te quedan; "+ fallas + " de "+ "5 vidas");
                    // por cada intento que falle pierde 5 puntos
                    puntaje = puntaje -5;
                    // si el puntaje es negativo el valor sera 0
                    if (puntaje < 0){
                        puntaje = 0;
                    }
                }
                // se reinicia el contador
                contador = 0;
            }

            // si llega a  a vidas 0 el jugador pierde
            if(vidas == 0){
                Ahorcar(vidas);
                System.out.println("Tu puntuacion fue de: " + puntaje);
                System.err.println("Tus intentos incorrectos fueron: "+ fallas);
                System.out.println("La palabra era: " + palabra);
                //preguntamos si quiere seguir jugando
                System.out.println("Quieres jugar de nuevo?");
                System.out.println(" Ingresa 1 para seguir jugando o 0 para finalizar");
                jugador = sc.nextInt();
            } else {
                //pero si no, quiere decir que gano y ha descubierto la palabra
                System.out.println("");
                for (int i = 0; i < tamaño; i++) {
                        System.out.print("__" + respuesta[i]+ "__  ");
                }
                System.out.println("Felicidades has ganado");
                System.out.println("Tu puntuacion fue: " + puntaje);
                System.out.println("Las veces que fallaste fueron: " + fallas);

                // para preguntar si quiere seguir jugando
                System.out.println("Quieres jugar de nuevo?");
                System.out.println(" Ingresa 1 para seguir jugando o 0 para finalizar");
                jugador = sc.nextInt();

                    // para reiniciar los valoresy empenzar de nuevo el ahorcado
                palabra = palabras [ (int)  (Math.random() * 8)];
                vidas =5;
                aciertos = 0;
                puntaje = 0;
                tamaño = palabra.length();
                respuesta = new char[tamaño];
                for (int i =tamaño; i < tamaño; i++) {
                    respuesta[i] = 'x';
            }
        }
        sc.close();
            
                    
        }
    }


    private static void Ahorcar (int i) {
        switch (i) {
            

            case 5:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                for (int j = 0; j <= 10; j++) {
                    System.out.println(" |");

                }
                System.out.println("____");
                break;

            case 4:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j <= 5; j++) {
                    System.out.println(" |");

                }
                System.out.println("____");
                break;

            case 3:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / |   ");
                System.out.println(" |                 /   |   ");
                System.out.println(" |                /    |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j <= 5; j++) {
                    System.out.println(" |");

                }
                System.out.println("____");
                break;

            case 2:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                for (int j = 0; j <= 5; j++) {
                    System.out.println(" |");

                }
                System.out.println("____");
                break;

            case 1:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    /  ");
                System.out.println(" |                   /      ");
                System.out.println(" |                  /       ");
                for (int j = 0; j <= 2; j++) {
                    System.out.println(" |");

                }
                System.out.println("____");
                break;

            case 0:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | X  X  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    / \\");
                System.out.println(" |                   /   \\  ");
                System.out.println(" |                  /     \\ ");
                for (int j = 0; j <= 2; j++) {
                    System.out.println(" |");

                }
                System.out.println("____________");
                
                System.out.println("HAS PERDIDO");
                break;
    }

}
}
    







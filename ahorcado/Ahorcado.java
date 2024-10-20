package ahorcado;
import java.util.Scanner;
public class Ahorcado{
    public static void  main (String[] args) {
    
        Scanner sc =  new Scanner(System.in);
    
        int vidas = 5;
    
        String palabra;
    
        int aciertos = 0, fallas = 0;
    
        int tamaño;

        String option;
    
        int contador = 0;
    
        String [] palabras = new String[] {"ordenador","pantalla","perro","cuadro","mesa","ventana","arboles","cepillo"};
    
        char[]  respuesta;
    
        palabra = palabras[(int) (Math.random()* 8) ];
    
        tamaño = palabra.length();
    
        respuesta = new char[tamaño];

        int puntaje = 0;
    
        int jugador = 1;

        int letrasfaltantes = tamaño;

        for (int i = 0; i < tamaño; i++) {
            respuesta[i] = 'x';
        }
    
        while (jugador != 0) {

            while (aciertos < tamaño && vidas > 0) {
            
                System.out.println("======== AHORCADO :) ========  VIDAS=" + vidas + " Aciertos= " + aciertos + " Puntuacion = " + puntaje + " Faltan " + letrasfaltantes + " letras");
                
            
                Ahorcar(vidas);
    
                System.out.println("");

            
                for (int i = 0;i < tamaño; i++) {

                    System.out.print("__" + respuesta[i] + "__ ");
                    
                }
            
                System.out.println("Ingresa una letra: ");
                option = sc. next();

            
                if (palabra.contains(option)) {
                    for (int i = 0; i < tamaño; i++) {
                        if (palabra.charAt(i)==option.charAt(0)) {
                            respuesta[i] = option.charAt(0);
                            contador ++;
                        }
                        
                    }

                    letrasfaltantes= tamaño - contador;

                    aciertos = aciertos + contador;
                
                    puntaje = puntaje + 10;
                } else {
                
                    vidas--;
                    fallas++;
                
                    System.out.println("Vaya! te quedan; "+ fallas + " de "+ "5 vidas");
                    
                    puntaje = puntaje -5;
                    
                    if (puntaje < 0){
                        puntaje = 0;
                    }
                }
                
                contador = 0;
            }

        
            if(vidas == 0){
                Ahorcar(vidas);
                System.out.println("Tu puntuacion fue de: " + puntaje);
                System.err.println("Tus intentos incorrectos fueron: "+ fallas);
                System.out.println("La palabra era: " + palabra);
            
                System.out.println("Quieres jugar de nuevo?");
                System.out.println(" Ingresa 1 para seguir jugando o 0 para finalizar");
                jugador = sc.nextInt();
            } else {
            
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
    
        }

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
    







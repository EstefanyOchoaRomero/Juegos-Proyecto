import java.util.Scanner;

public class AdivinarNumero{

    public static void main(String[] args) {
    
        int numAleatorio;
        numAleatorio = (int) (Math.random()*100+1);
        int num=0;
        boolean terminar=false;
        int nIntentos=0;
        Scanner sc = new Scanner(System.in);
        String reiniciar="";

        System.out.println("El juego consiste en averiguar un número secreto entre 1 y 100.");

        while (terminar==false || reiniciar.equals("s") || reiniciar.equals("S")){
        
        System.out.print("Ingresa un número: ");
        num=sc.nextInt();
        nIntentos++;

        if(num < 1 || num > 100){
            System.out.println("El número debe estar entre 1 y 100");
        }
        else if(num > numAleatorio){
            System.out.println("Ohhh!!Vuelve a intentarlo");
            System.out.println("El número es menor que el número que ingresaste\n");
            terminar =false;
        }
        else if(num < numAleatorio){
            System.out.println("Ohhh!!Vuelve a intentarlo");
            System.out.println("El número es mayor que el número que ingresaste\n");
            terminar =false;

        }                
        else if(num==numAleatorio){
            System.out.println("Bien!!Has ganado!!");
            System.out.println("");            
		    System.out.println("Total de intentos jugados: " + nIntentos);
            System.out.print("¿Quieres volver a jugar? S(Si) o N(No)");
            reiniciar=sc.next(); 
                if(reiniciar.equals("s") || reiniciar.equals("S")){
                    nIntentos=0;
                    terminar=false;
                        
                }
                    else{

                        terminar=true;
                }
                
        }
    }
    sc.close();

    }
    
    
}
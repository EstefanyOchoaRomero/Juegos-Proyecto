import java.util.Scanner;

public class AdivinarNumero{
    public static void main(String[] args) {
    
    int numAleatorio;
    numAleatorio = (int) (Math.random()*100+1);
    int num=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("El juego consiste en averiguar un número secreto entre 1 y 100.");

    while (num!= numAleatorio){
        
        System.out.print("Ingresa un número: ");
        num=sc.nextInt();
        if (num < numAleatorio) {
            System.out.println("El numero es menor que el numero secreto");
        }
        else if (num > numAleatorio) {

            System.out.println("El numero es mayor que el numero secreto");
        }
        else if(num==numAleatorio){
            System.out.print("Bien!!Has ganado!!");
        }
        else{
            System.out.print("Ohhh!!Vuelve a intentarlo\n");

        }
            
    }
        
    sc.close();
}}
    


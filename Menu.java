
import ahorcado.Ahorcado;
import java.util.Scanner;

    public class Menu {

        public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int option=0;

        while(option != 3){

            System.out.println("Elige el juego pulsando el numero de la opcion:");
            System.out.println("1.Adivina el numero");
            System.out.println("2.El ahorcado");
            System.out.println("3.Salir");

            option=sc.nextInt();

            switch(option){
                case 1:
                    AdivinarNumero.main(args);
                    break;
                case 2:
                    Ahorcado.main(args);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Número no reconocido");
                    break;
            }
        }
        sc.close();

    }
    
}

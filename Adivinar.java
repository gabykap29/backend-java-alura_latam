import java.util.Random;
import java.util.Scanner;

public class Adivinar {
    public static void main(String[] args) {
        int inputUsuario = 0;
        int contador = 0;
        int numeroGanandor = new Random().nextInt(100);
        Scanner teclado = new Scanner(System.in);
        while(inputUsuario != numeroGanandor){
            System.out.println("Suerte! ingrese un numero: ");
            inputUsuario = teclado.nextInt();
            contador ++;
            if(contador >= 5 ){
                System.out.println("Perdiste!...el numero era: "+ numeroGanandor);
                break;
            }else if(contador < 5 && (inputUsuario != numeroGanandor)){
                if(numeroGanandor > inputUsuario){
                    System.out.println("Numero Incorrecto!, intenta de nuevo!...intenta con un valor mayor!");
                }else{
                    System.out.println("Numero Incorrecto!, intenta con un numero menor...");
                }
            }else if (inputUsuario == numeroGanandor){
                System.out.println("Bien hecho!, el numero es: "+ numeroGanandor);
                break;
            }
        }
        teclado.close();
    }
}

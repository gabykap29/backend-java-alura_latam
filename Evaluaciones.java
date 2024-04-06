import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        String[] peliculas = {"El señor de los anillos", "Harry Potter", "El padrino", "El rey león", "La vida es bella"};
        Scanner teclado = new Scanner(System.in);
        double nota = 1;
        double mediaEvaluaciones = 0.0;
        double totalEvaluaciones = 0.0;
        int contador = 0;
        while(nota > 0){
            if(nota < 0 || contador == peliculas.length){
                break;
            }
            System.out.println("Ingrese la nota que le darias a:"+ peliculas[contador]);
            nota = teclado.nextDouble();
            mediaEvaluaciones += nota;
            totalEvaluaciones ++;
            contador ++;
        }
        teclado.close();
        System.out.println("La media de las evaluaciones es: " + mediaEvaluaciones/totalEvaluaciones);
    }
}

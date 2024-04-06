import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        String[] arrayPeliculas = {"El señor de los anillos", "Harry Potter", "El padrino"};
        Scanner teclado = new Scanner(System.in);
        Double mediaEvaluacion = 0.0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darias a la pelicula:"+ arrayPeliculas[i]);
            nota = teclado.nextDouble();
            mediaEvaluacion = nota + 3;
        }
        teclado.close();
        mediaEvaluacion = mediaEvaluacion / 3;
        System.out.println("La media de las evaluaciones es: " + mediaEvaluacion);
    }
}

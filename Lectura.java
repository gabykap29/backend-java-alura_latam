//la clase Scanner nos permite leer datos que se ingresan por consola, se importa desde java.util.Scanner
import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        //se crea una instancia de la clase Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su pelicula favorita!: ");
        String pelicula = teclado.nextLine();
        System.out.println("Ingrese la fecha de estreno de la pelicula: ");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Que calificación le pondría a la pelicula? (1-10): ");
        double calificacion = teclado.nextDouble();
        //Se cierra el Scanner
        // es importante cerrar el Scanner para liberar recursos
        teclado.close();
        System.out.println(String.format("""
                Pelicula: %s,
                Fecha de lanzamiento: %d,
                Calificación: %.2f
                """, pelicula, fechaDeLanzamiento, calificacion));
    }
}

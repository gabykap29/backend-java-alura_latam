class Main{
    public static void main(String[]args){
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula:Matrix");

        int fechaDeLanzamiento= 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        //converción de datos
        int clasificacion = (int)(media /2);



        // En java es posible concatenar dentro del string con el metodo format de la clase String
        String sinopsis = String.format("""
                Es una pelicula lanzada en el año %d y que cuenta con una puntuación
                de %f
                """,fechaDeLanzamiento,media);
        // %d numero entero, %s string, %f flotante
        System.out.println(sinopsis);

        String saludo = "Hola, mi nombre es ";
        String nombre= "Alicia ";
        String continuacion = "y mi edad es ";
        int edad = 17;
        System.out.println(saludo + nombre + continuacion + edad);

    }
}


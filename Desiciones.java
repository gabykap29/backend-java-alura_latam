public class Desiciones {
    public static void main(String[] args) {
        int fechaLanzamiento = 2023;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String plan = "plus";
        if(fechaLanzamiento <= 2020){
            System.out.println("La pelicula es antigua, pero vale la pena verla!");
        }else{
            System.out.println("La pelicula es reciente");
        }
        //el equals es un metodo de la clase String que compara dos cadenas de texto
        if(incluidoEnElPlan || plan.equals("plus")){
            System.out.println("Puedes ver la pelicula");
        }else{
            System.out.println("No puedes ver la pelicula, actualice su plan!");
        }

    }
}
class DesafioTemperatura{
    public static void main(String[]args){
        int temperaturaC = 30;
        double temperaturaF = (temperaturaC * 1.8) + 32;
        int temperaturaResultado = (int) (temperaturaF);
        System.out.println(String.format("La temperatura en Fahrenheit es: %d°",temperaturaResultado));
    }
}
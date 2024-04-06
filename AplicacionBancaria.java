import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AplicacionBancaria {
    public static void main(String[] args) {
        double cuenta = 5000.0;
        double deposito;
        double retiro = 0.0;
        String nombreDeCuenta = "Gabriel Acosta";
        double transferencia;
        String aliasTransferencia = "";
        ArrayList <String> movimientosRealizados = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int inputUsuario;
        String menu = String.format("""
                *************************************************
                Bienvenido de vuelta! %s
                Ingrese una opción, según su consulta...
                Cuenta: %2f$USD
                1- Realizar un depósito.
                2- Retirar dinero.
                3- Realizar una transferencia.
                4- Ultimos movimientos.
                9- Salir.
                *************************************************
                """,nombreDeCuenta,cuenta);

        System.out.println(menu);
        inputUsuario = teclado.nextInt();
        teclado.nextLine();
        while (inputUsuario != 9){
            switch (inputUsuario){
                case 1:{
                    System.out.println("""
                            Cuanto desea Depositar? ingrese el monto en Dolares.
                            """);
                    String inputDeposito = teclado.next();
                    deposito = Double.parseDouble(inputDeposito);
                    teclado.nextLine();
                    cuenta += deposito;
                    System.out.println("Deposito realizado con exito!, dinero total: "+ cuenta+"$USD");
                    //Instancio la clase Date en fecha, para obtener la fecha actual.
                    Date fecha = new Date();
                    //la formateo en texto para poder guardarla en el array de movimientos.
                    SimpleDateFormat formatearFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    String fechaActual = formatearFecha.format(fecha);
                    movimientosRealizados.add(String.format("%s- Deposito de %2f ",fechaActual,deposito ));
                    break;
                }
                case 2:{
                    System.out.println("Ingrese la cantidad a Retirar..cuenta actual: "+ cuenta+"$USD");
                    String inputRetiro = teclado.next();
                    retiro = Double.parseDouble(inputRetiro);
                    teclado.nextLine();
                    if(retiro > cuenta){
                        System.out.println("SALDO INSUFICIENTE!");
                        break;
                    }
                    cuenta -= retiro;

                    Date fecha = new Date();
                    SimpleDateFormat formatearFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    String fechaActual = formatearFecha.format(fecha);

                    System.out.println(String.format("""
                            Retiro exitoso!
                            Cuenta actual:%2f $USD
                            """,cuenta));
                    movimientosRealizados.add(String.format("%s- Retiro de %2f ",fechaActual,retiro ));
                    break;
                }
                case 3:{
                    System.out.println("""
                            Transferir...
                            Ingrese el Alias de la cuenta bancaria:
                            """);
                    aliasTransferencia = teclado.nextLine();
                    if(aliasTransferencia.length()<1){
                        System.out.println("Alias INVÁDILO!...");
                        break;
                    }
                    System.out.println("Dinero a transferir: ");
                    String inputTransferencia = teclado.next();
                    transferencia = Double.parseDouble(inputTransferencia);
                    teclado.nextLine(); // Consumir el salto de línea
                    if(transferencia > cuenta){
                        System.out.println("Dinero insuficiente!");
                        break;
                    }
                    cuenta -= transferencia;
                    Date fecha = new Date();
                    SimpleDateFormat formatearFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    String fechaActual = formatearFecha.format(fecha);
                    movimientosRealizados.add(String.format("%s- Tranferencia de %2f a %s",fechaActual,transferencia,
                            aliasTransferencia ));
                    System.out.println(String.format("""
                            Transferencia realizada con exito!
                            Tranferido: %2f a %s -- %s
                            """,transferencia,aliasTransferencia,fechaActual));
                    break;
                }
                case 4: {
                    System.out.println("""
                            *****************************************************
                            Movimientos Realizados....
                            """);
                    if(movimientosRealizados.size()== 0){
                        System.out.println("Aún no hay movimientos en su cuenta...");
                        break;
                    }

                    for(int i = 0; i < movimientosRealizados.size();i++){
                        System.out.println(String.format("""
                                %s
                                """, movimientosRealizados.get(i)));
                    }
                    System.out.println("""
                            *****************************************************
                            """);
                    break;
                }
            }
            System.out.println(menu);
            inputUsuario = teclado.nextInt();
            teclado.nextLine();
        }

    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while(opcion != 5){

            System.out.println("******************************");
            System.out.println(" Conversor de Monedas ");
            System.out.println("1 - USD a MXN");
            System.out.println("2 - MXN a USD");
            System.out.println("3 - USD a EUR");
            System.out.println("4 - EUR a USD");
            System.out.println("5 - Salir");
            System.out.println("******************************");

            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if(opcion == 5){
                System.out.println("Programa finalizado.");
                break;
            }

            System.out.print("Ingresa la cantidad: ");
            double cantidad = scanner.nextDouble();

            double resultado = 0;

            switch(opcion){

                case 1:
                    resultado = cantidad * 17;
                    break;

                case 2:
                    resultado = cantidad / 17;
                    break;

                case 3:
                    resultado = cantidad * 0.92;
                    break;

                case 4:
                    resultado = cantidad / 0.92;
                    break;

                default:
                    System.out.println("Opción no válida");
                    continue;
            }

            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
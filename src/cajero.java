import java.util.Scanner;

public class cajero {

    private static double saldo = 1000.00;

    public static void simularCajero() {
        Scanner scanner = new Scanner(System.in);
        int opcionCajero;

        do {
            System.out.println("\n--- CAJERO AUTOMÁTICO ---");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Depositar Dinero");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Seleccione una operación (0-3): ");

            if (scanner.hasNextInt()) {
                opcionCajero = scanner.nextInt();
                scanner.nextLine();

                switch (opcionCajero) {
                    case 1:
                        consultarSaldo();
                        break;
                    case 2:
                        retirarDinero(scanner);
                        break;
                    case 3:
                        depositarDinero(scanner);
                        break;
                    case 0:
                        System.out.println("\nRegresando al menú principal...");
                        break;
                    default:
                        System.out.println("\nOpción no válida. Intente de nuevo.");
                }
            } else {
                System.out.println("\nEntrada inválida. Por favor, ingrese un número.");
                scanner.next();
                opcionCajero = -1;
            }
        } while (opcionCajero != 0);
    }

    private static void consultarSaldo() {
        System.out.printf("\nSu saldo actual es: $%.2f%n", saldo);
    }

    private static void retirarDinero(Scanner scanner) {
        System.out.print("Ingrese la cantidad a retirar: $");
        if (scanner.hasNextDouble()) {
            double cantidad = scanner.nextDouble();
            scanner.nextLine();

            if (cantidad > 0 && cantidad <= saldo) {
                saldo -= cantidad;
                System.out.printf("Retiro exitoso. Nuevo saldo: $%.2f%n", saldo);
            } else if (cantidad > saldo) {
                System.out.println("¡Error! Saldo insuficiente.");
            } else {
                System.out.println("¡Error! La cantidad debe ser positiva.");
            }
        } else {
            System.out.println("Entrada inválida.");
            scanner.nextLine();
        }
    }

    private static void depositarDinero(Scanner scanner) {
        System.out.print("Ingrese la cantidad a depositar: $");
        if (scanner.hasNextDouble()) {
            double cantidad = scanner.nextDouble();
            scanner.nextLine();

            if (cantidad > 0) {
                saldo += cantidad;
                System.out.printf("Depósito exitoso. Nuevo saldo: $%.2f%n", saldo);
            } else {
                System.out.println("¡Error! La cantidad debe ser positiva.");
            }
        } else {
            System.out.println("Entrada inválida.");
            scanner.nextLine();
        }
    }
}
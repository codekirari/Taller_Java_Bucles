import java.util.Scanner;
public class registradora {
    public static void caja_registradora() {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        int opcion;

        System.out.println("--- 🍔 Menú Comida Rápida ---");
        System.out.println("1. Hamburguesa: $50");
        System.out.println("2. Papas:       $30");
        System.out.println("3. Refresco:    $20");
        System.out.println("4. Terminar pedido y Pagar");

        do {
            System.out.print("\nSeleccione una opción (1-4): ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        total += 50.0;
                        System.out.println("• Hamburguesa agregada. Subtotal: $" + total);
                        break;
                    case 2:
                        total += 30.0;
                        System.out.println("• Papas agregadas. Subtotal: $" + total);
                        break;
                    case 3:
                        total += 20.0;
                        System.out.println("• Refresco agregado. Subtotal: $" + total);
                        break;
                    case 4:
                        System.out.println("\n--- Ingresando al pago ---");
                        break;
                    default:
                        System.out.println("Intente de nuevo con un a opción valida.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next();
                opcion = 0;
            }
        } while (opcion != 4);


        System.out.println("Total a pagar: $" + total);
        if (total > 0) {
            double pago = 0.0;
            System.out.print("Ingrese la cantidad con la que paga: $");
            if (scanner.hasNextDouble()) {
                pago = scanner.nextDouble();
                if (pago >= total) {
                    double cambio = pago - total;
                    System.out.println("✅ Pago recibido. Su cambio es: **$" + String.format("%.2f", cambio) + "**");
                } else {
                    System.out.println("❌ Pago insuficiente. Por favor, reinicie el pedido.");
                }
            } else {
                System.out.println("Entrada de pago incorrectq.");
            }
        }
    }
}
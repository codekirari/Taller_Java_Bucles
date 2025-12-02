import java.util.Scanner;

public class descuentos {
    public static void descuentos_producto() {
        Scanner scanner = new Scanner(System.in);
        double precioOriginal;

        System.out.println("--- 💰 Calculadora de Descuentos 💰---");
        System.out.print("Ingrese el precio original del producto: $");

        if (scanner.hasNextDouble()) {
            precioOriginal = scanner.nextDouble();
            System.out.println("\nPrecio Original: **$" + String.format("%.2f", precioOriginal) + "**");
            System.out.println("👛💰--------💰👛");


            for (int i = 10; i <= 50; i += 10) {
                double porcentajeDescuento = (double) i / 100;
                double descuento = precioOriginal * porcentajeDescuento;
                double precioFinal = precioOriginal - descuento;

                System.out.println(
                        i + "% Descuento (" + String.format("%.2f", descuento) + "): " +
                                "**$" + String.format("%.2f", precioFinal) + "**"
                );
            }
        } else {
            System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
        }
    }
}
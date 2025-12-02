import java.util.Scanner;
public class tabla_multiplicar {
    public static void mostrarTabla() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean entradaValida = false;

        System.out.println("--- Tabla de Multiplicar ---");

        while (!entradaValida) {
            System.out.print("Ingrese un número del 1 al 10: ");

            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();

                if (numero >= 1 && numero <= 10) {
                    entradaValida = true;

                    System.out.println("\nTabla del --" + numero + "--:");


                    for (int i = 1; i <= 10; i++) {
                        int resultado = numero * i;
                        System.out.println(numero + " x " + i + " = " + resultado);
                    }
                } else {
                    System.out.println("Número fuera del rango (1-10). Intente de nuevo.");
                }
            } else {
                System.out.println("Por favor, ingrese un número entero.");
                scanner.next();
            }
        }
    }
}
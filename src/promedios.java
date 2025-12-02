import java.util.Scanner;

public class promedios {

    public static void calcularPromedio() {
        Scanner scanner = new Scanner(System.in);
        int cantidadNotas = 0;
        double sumaNotas = 0.0;
        boolean entradaValida = false;

        System.out.println("\n--- CALCULADORA DE PROMEDIOS ---");


        while (!entradaValida) {
            System.out.print("¿Cuántas calificaciones desea ingresar? ");
            if (scanner.hasNextInt()) {
                cantidadNotas = scanner.nextInt();
                scanner.nextLine();
                if (cantidadNotas > 0) {
                    entradaValida = true;
                } else {
                    System.out.println("Debe ingresar al menos una nota.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next();
            }
        }


        for (int i = 1; i <= cantidadNotas; i++) {
            double nota = 0.0;
            boolean notaValida = false;
            while (!notaValida) {
                System.out.printf("Ingrese la nota #%d (0.0 a 10.0): ", i);
                if (scanner.hasNextDouble()) {
                    nota = scanner.nextDouble();
                    scanner.nextLine();
                    if (nota >= 0 && nota <= 10) {
                        sumaNotas += nota;
                        notaValida = true;
                    } else {
                        System.out.println("Nota fuera del rango. Intente de nuevo.");
                    }
                } else {
                    System.out.println("Entrada inválida. Ingrese un valor numérico.");
                    scanner.next();
                }
            }
        }


        double promedio = sumaNotas / cantidadNotas;


        System.out.printf("\nEl promedio de las %d notas es: %.2f%n", cantidadNotas, promedio);

        if (promedio < 6.0) {
            System.out.println("Estado: Reprobado 😔");
        } else if (promedio >= 6.0 && promedio <= 7.9) {
            System.out.println("Estado: Aprobado 😊");
        } else {
            System.out.println("Estado: ¡Excelente! 🌟");
        }
    }
}

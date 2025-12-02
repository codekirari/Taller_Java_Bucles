import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class asistencia {

    public static void registrarAsistencia() {
        Scanner scanner = new Scanner(System.in);
        List<String> presentes = new ArrayList<>();
        List<String> ausentes = new ArrayList<>();
        int totalEstudiantes = 0;
        boolean entradaValida = false;

        System.out.println("\n--- ASISTENCIA ---");


        while (!entradaValida) {
            System.out.print("¿Cuántos estudiantes hay en total? ");
            if (scanner.hasNextInt()) {
                totalEstudiantes = scanner.nextInt();
                scanner.nextLine();
                if (totalEstudiantes > 0) {
                    entradaValida = true;
                } else {
                    System.out.println("El número de estudiantes debe ser positivo.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next();
            }
        }


        for (int i = 1; i <= totalEstudiantes; i++) {
            System.out.println("\nEstudiante #" + i);
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = scanner.nextLine();

            String estado = "";
            do {
                System.out.print("¿Está Presente (P) o Ausente (A)? (P/A): ");
                estado = scanner.nextLine().toUpperCase();

                if (estado.equals("P")) {
                    presentes.add(nombre);
                    break;
                } else if (estado.equals("A")) {
                    ausentes.add(nombre);
                    break;
                } else {
                    System.out.println("Opción no válida. Ingrese 'P' o 'A'.");
                }
            } while (true);
        }


        System.out.println("\n--- total asistencia ---");
        System.out.println("Estudiantes Presentes (" + presentes.size() + "): " + presentes);
        System.out.println("Estudiantes Ausentes (" + ausentes.size() + "): " + ausentes);
    }
}
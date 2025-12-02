import java.util.Random;
import java.util.Scanner;

public class contraseña {

    public static void generarContraseña() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String letrasMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String especiales = "!@#$%^&*()-_+=<>?";
        String todosCaracteres = letrasMayusculas + letrasMinusculas + numeros + especiales;

        int longitud = 0;
        boolean entradaValida = false;

        System.out.println("\n--- GENERADOR DE CONTRASEÑAS ---");

        while (!entradaValida) {
            System.out.print("Ingrese la longitud deseada para la contraseña (mínimo 8): ");
            if (scanner.hasNextInt()) {
                longitud = scanner.nextInt();
                if (longitud >= 8) {
                    entradaValida = true;
                } else {
                    System.out.println("Ingrese la cantidad señalada(mínimo 8) Intente de nuevo.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next();
            }
        }
        scanner.nextLine();

        StringBuilder contraseña = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(todosCaracteres.length());
            contraseña.append(todosCaracteres.charAt(indiceAleatorio));
        }

        System.out.println("\nContraseña generada: " + contraseña.toString());
    }
}
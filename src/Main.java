import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int opcion;

                do {
                    System.out.println("--       TALLER JAVA 6 - BUCLES MENU       --");
                    System.out.println("1. Caja Registradora");
                    System.out.println("2. Calculadora de Descuentos");
                    System.out.println("3. Tabla de Multiplicar");
                    System.out.println("4. Cajero Automático");
                    System.out.println("5. Generador de Contraseñas");
                    System.out.println("6. Control de Asistencia");
                    System.out.println("7. Calculadora de Promedios");
                    System.out.println("0. Salir del Programa");
                    System.out.print("Seleccione un ejercicio para ejecutar (0-7): ");

                    if (scanner.hasNextInt()) {
                        opcion = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcion) {
                            case 1:
                                registradora.simularCaja();
                                break;
                            case 2:
                                descuentos.calcularDescuentos();
                                break;
                            case 3:
                                tabla_multiplicar.mostrarTabla();
                                break;
                            case 4:
                                cajero.simularCajero();
                                break;
                            case 5:
                                contraseña.generarContrasena();
                                break;
                            case 6:
                                asistencia.registrarAsistencia();
                                break;
                            case 7:
                                promedios.calcularPromedio();
                                break;
                            case 0:
                                System.out.println("\n Saliendo del programa. ¡Regrese pronto!");
                                break;
                            default:
                                System.out.println("\n Opción no válida. Intente de nuevo.");
                        }
                    } else {
                        System.out.println("\nEntrada inválida. Por favor, ingrese un número.");
                        scanner.next();
                        opcion = -1;
                    }
                } while (opcion != 0);

                scanner.close();
            }
        }
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double a = 0, b = 0; // variables

        do {
            System.out.println("\n----- Menú de Operaciones -----");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Porcentaje");
            System.out.println("6. Raíz cuadrada");
            System.out.println("0. Salir");
            System.out.print("Elija una operación (0-6): ");

            opcion = scanner.nextInt();
            //opc 1_5 y  0 salir / 6 raiz
            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Ingrese el primer número: ");
                a = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                b = scanner.nextDouble();
            } else if (opcion == 6) {
                System.out.print("Ingrese un número para calcular su raíz: ");
                a = scanner.nextDouble();
            }

            switch (opcion) {
                case 1: // Suma
                    System.out.println("Resultado: " + (a + b));
                    break;

                case 2: // Resta
                    System.out.println("Resultado: " + (a - b));
                    break;

                case 3: // Multiplicación
                    System.out.println("Resultado: " + (a * b));
                    break;

                case 4: // División
                    if (b != 0) {
                        System.out.println("Resultado: " + (a / b));
                    } else {
                        System.out.println("¡Error! No se puede dividir entre cero.");
                    }
                    break;

                case 5: // Porcentaje
                    System.out.println("Resultado: " + (a * (b / 100)));
                    break;

                case 6: // Raíz cuadrada
                    if (a >= 0) {
                        System.out.println("Resultado: " + Math.sqrt(a));
                    } else {
                        System.out.println("¡Error! No existe raíz ");
                    }
                    break;

                case 0:
                    System.out.println("Salir...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
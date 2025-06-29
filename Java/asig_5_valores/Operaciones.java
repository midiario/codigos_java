import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de los 5 números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        System.out.print("Ingrese el cuarto número: ");
        int num4 = scanner.nextInt();

        System.out.print("Ingrese el quinto número: ");
        int num5 = scanner.nextInt();

        // Cálculos
        int suma = num1 + num2 + num3 + num4 + num5;
        int producto = num1 * num4;
        int diferencia = num5 - num2;

        // Salidas
        System.out.println("Suma de todos los números: " + suma);
        System.out.println("Producto del primero con el cuarto: " + producto);
        System.out.println("Diferencia del quinto con el segundo: " + diferencia);
    }
}

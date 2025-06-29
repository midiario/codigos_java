import java.util.Scanner;

public class Heladeria_2 {
    public static void main(String[] args) {

        int control=1;
        int opc;
        int c = 0, v = 0, f = 0, l = 0; // Acumuladores por sabor
        int cantidad;
        int total;

        while (control > 0){
            System.out.println("\n--- MENÚ DE SABORES ---");
            System.out.println("1. Chocolate 2bs");
            System.out.println("2. Vainilla 3bs");
            System.out.println("3. Frutilla 4ba");
            System.out.println("4. Leche 5bs");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            Scanner sc1 = new Scanner(System.in); // Declaración correcta del Scanner
            opc = sc1.nextInt(); // Lectura numérica correcta
            control=opc;
            switch (opc) {
                case 1:
                    System.out.print("¿Cuántos helados de Chocolate desea? ");

                    // Lectura de cantidad
                    Scanner AUX1 = new Scanner(System.in); // Declaración correcta del Scanner
                    cantidad = AUX1.nextInt(); // Lectura numérica correcta

                    c += cantidad * 2; // Precio por unidad = 5
                    break;
                case 2:
                    System.out.print("¿Cuántos helados de Vainilla desea? ");
                    Scanner AUX2 = new Scanner(System.in); // Declaración correcta del Scanner
                    cantidad = AUX2.nextInt(); // Lectura numérica correcta

                    v += cantidad * 3;
                    break;
                case 3:
                    System.out.print("¿Cuántos helados de Frutilla desea? ");
                    Scanner AUX3 = new Scanner(System.in); // Declaración correcta del Scanner
                    cantidad = AUX3.nextInt(); // Lectura numérica correcta

                    f += cantidad * 4;
                    break;
                case 4:
                    System.out.print("¿Cuántos helados de Leche desea? ");
                    Scanner AUX4 = new Scanner(System.in); // Declaración correcta del Scanner
                    cantidad = AUX4.nextInt(); // Lectura numérica correcta

                    l += cantidad * 5;
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        }

        total = c + v + f + l;

        System.out.println("\n--- RESUMEN DE COMPRA ---");


        System.out.println("Total a pagar: Bs " + total);


    }
}

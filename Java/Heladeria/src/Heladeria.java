import javax.swing.*;
import java.util.Scanner;


import java.util.Scanner;
import javax.swing.JOptionPane;

public class Heladeria {
    public static void main(String[] args) {

        System.out.println("Elija una OPCIÓN:");
        System.out.println("1. Por Unidad");
        System.out.println("2. Por Mayor");
        Scanner N = new Scanner(System.in); // Declaración correcta del Scanner

        int opcion = N.nextInt(); // Lectura numérica correcta

        if (opcion == 1) {
            System.out.println("Sabores disponibles:");
            System.out.println("1. Leche");
            System.out.println("2. Chocolate");
            System.out.println("3. Vainilla");
            System.out.println("4. Frutilla");


            int opc =Integer.parseInt(JOptionPane.showInputDialog("Ingrese su eleccion: "));
            switch (opc){
                case 1:System.out.println("Cuesta 5 bs.");
                    break;

                case 2:System.out.println("Cuesta 7 bs.");
                    break;

                case 3:System.out.println("Cuesta 4 bs.");
                    break;

                case 4:System.out.println("Cuesta 6 bs.");
                    break;
                default: System.out.println("Opción inválida."); break;
            }

        }
        if (opcion == 2){
            System.out.println("Sabores disponibles:");
            System.out.println("1. Leche");
            System.out.println("2. Chocolate");
            System.out.println("3. Vainilla");
            System.out.println("4. Frutilla");

            // Lectura de cantidad
            Scanner AUX1 = new Scanner(System.in); // Declaración correcta del Scanner

            int opc2 = AUX1.nextInt(); // Lectura numérica correcta

            System.out.print("¿Cuántos va a querer?: ");
            Scanner AUX2 = new Scanner(System.in); // Declaración correcta del Scanner
            int A = AUX1.nextInt(); // Lectura numérica correcta

            // precio
            int C = 0;

            switch (opc2) {
                case 1: C = 5; break;
                case 2: C = 7; break;
                case 3: C = 4; break;
                case 4: C = 6; break;
                default: System.out.println("Opción inválida."); break;
            }
            if (C > 0) {
                int total = C * A;
                System.out.println("Precio unitario: " + C + " Bs.");
                System.out.println("Total a pagar por " + A + " helado(s): " + total + " Bs.");
            }

        }
    }
}

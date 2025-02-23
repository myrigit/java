package Formas;
import java.util.Scanner;

public class RHueco {
    public static void forma(int n) {
        int mitad = (n - 1) / 2 + 1;

        // Parte superior (pirámide normal)
        for (int i = 1; i <= mitad; i++) {
            // Espacios iniciales
            for (int j = 1; j <= mitad - i; j++) {
                System.out.print(" ");
            }
            // Primer asterisco
            System.out.print("*");

            // Espacios internos
            if (i > 1) {
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }
                // Segundo asterisco
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte inferior (pirámide invertida)
        for (int i = mitad - 1; i >= 1; i--) {
            // Espacios iniciales
            for (int j = 1; j <= mitad - i; j++) {
                System.out.print(" ");
            }
            // Primer asterisco
            System.out.print("*");

            // Espacios internos
            if (i > 1) {
                for (int j = 1; j <= (2 * i - 3); j++) {    
                    System.out.print(" ");
                }

                
                // Segundo asterisco
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número impar de filas: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Por favor, introduce un número impar.");
        } else {
            forma(n);
        }

        sc.close();
    }
}
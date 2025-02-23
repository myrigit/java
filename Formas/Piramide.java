package Formas;
import java.util.Scanner;

public class Piramide {
    // Método para imprimir una pirámide de altura n
    public void forma(int n) {
        for (int i = 1; i <= n; i++) {  // Controla las filas
            for (int j = 1; j <= (n - i); j++) {  // Imprime los espacios antes de los *
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {  // Imprime los * en cada fila
                System.out.print("*");
            }
            System.out.println();  // Salto de línea para la siguiente fila
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Filas de la pirámide: ");
        int n = sc.nextInt();  // Usuario ingresa el tamaño de la pirámide
        
        Piramide piram = new Piramide();  // Crear objeto para llamar al método
        piram.forma(n);  // Generar la pirámide con el tamaño ingresado
        
        sc.close();  // Cerrar Scanner para liberar recursos
    }
}

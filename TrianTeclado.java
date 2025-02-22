import java.util.Scanner;

public class TrianTeclado {

    // Método que imprime un triángulo de tamaño n
    public void forma(int n) {
        for (int i = 1; i <= n; i++) {  // Controla las filas
            for (int j = 1; j <= i; j++) {  // Controla cuántos '*' se imprimen en cada fila
                System.out.print("*");
            }
            System.out.println();  // Salto de línea para la siguiente fila
        }
    }

    // Método principal (main)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe el tamaño base del triángulo: ");
        int n = sc.nextInt();  // Lee el tamaño ingresado por el usuario
        
        TrianTeclado tri = new TrianTeclado();  // Creación del objeto para llamar al método no estático
        tri.forma(n);  // Llamada al método con el tamaño ingresado
        
        sc.close();  // Cierre del Scanner para liberar recursos
    }
}


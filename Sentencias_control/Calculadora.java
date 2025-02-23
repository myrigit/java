package Sentencias_control;
import java.util.Scanner;

public class Calculadora {
    public static int sumar(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int multiplicar(int n, int m) {
        int p = n * m;
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { // Bucle infinito para mantener el menú activo hasta que el usuario elija salir
            System.out.println("Selecciona una opción: ");
            System.out.println("1. Sumar");
            System.out.println("2. Multiplicar");
            System.out.println("3. Salir");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Escribe el primer sumando: ");
                    int a = sc.nextInt();
                    System.out.print("Escribe el segundo sumando: ");
                    int b = sc.nextInt();
                    int suma = sumar(a, b);   // Llamada a método estático: se puede llamar directamente sin crear un objeto
                    System.out.println("El resultado de la suma es " + suma);
                    break;   // Sale del switch, pero el while sigue ejecutándose (el menú se vuelve a mostrar)

                case 2:
                    System.out.print("Escribe el primer multiplicando: ");
                    int n = sc.nextInt();
                    System.out.print("Escribe el segundo multiplicando: ");
                    int m = sc.nextInt();
                    Calculadora cal = new Calculadora(); // Se crea un objeto porque el método no es estático
                    int res = cal.multiplicar(n, m);
                    System.out.println("El resultado de la multiplicación es " + res);
                    break;  // Sale del switch, pero el while sigue ejecutándose (el menú se vuelve a mostrar)

                case 3:
                    System.out.println("Hasta otra");
                    sc.close();   // Cierra el Scanner para liberar recursos antes de salir del programa
                    return; // Sale del método main, terminando completamente la ejecución del programa

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;  // Sale del switch, pero el while sigue ejecutándose (el menú se vuelve a mostrar)
            }
        }
    }
}



/*Crea una clase Calculadora con dos métodos:
sumar(int a, int b): método estático (usa valores dentro del código).
multiplicar(int a, int b): método NO estático (pide valores por teclado).
En main(), usa ambos métodos correctamente.
*/
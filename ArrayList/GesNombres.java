import java.util.ArrayList;
import java.util.Scanner;

public class GesNombres {

    // Atributo: ArrayList que almacenará los nombres
    private ArrayList<String> nombres;  

    // Constructor de la clase (inicializa la lista con valores por defecto)
    public GesNombres() {
        this.nombres = new ArrayList<>();  // Se crea la lista en memoria con `new`
        nombres.add("Ana");  // Se añaden los nombres iniciales
        nombres.add("Luis");
        nombres.add("Marta");
        nombres.add("Carlos");
    }
    
    // Método para añadir un nombre a la lista
    public void anadirNom(String nom) {
        nombres.add(nom);  // `add()` agrega el nombre al ArrayList
        System.out.println("Lista actualizada"); // Mensaje para confirmar la operación
    }

    // Método para buscar y eliminar un nombre
    public void eliminarNom(String nom) {
        // Se verifica si el nombre está en la lista antes de eliminarlo
        if (nombres.contains(nom)) {  
            nombres.remove(nom);  // Se elimina el nombre si existe
            System.out.println(nom + " ha sido eliminado. Lista actualizada:");

            // Se recorre la lista para mostrar los nombres restantes
            for (String n : nombres) {  
                System.out.println(n);
            }
        } else {
            System.out.println("Ese nombre no está en la lista.");  // Mensaje de error si no está
        }
    }

    // Método para mostrar todos los nombres de la lista
    public void mostrarNom() {
        System.out.println("Lista actual de nombres:");

        // Se recorre la lista para imprimir cada nombre
        for (String n : nombres) {  
            System.out.println(n);
        }
    }

    // Punto de entrada del programa
    public static void main(String[] args) {
        // Se crea un objeto de la clase GesNombres para gestionar la lista
        GesNombres gestor = new GesNombres();
        Scanner sc = new Scanner(System.in); // Se inicializa el Scanner para la entrada de datos
        
        // Bucle infinito que mantiene el menú en ejecución hasta que el usuario elige salir
        while (true) {
            System.out.println("Elige una opción: 1.Añadir nombre, 2.Eliminar nombre, 3.Mostrar lista, 4.Salir");
            int op = sc.nextInt(); // Se lee la opción del usuario
            sc.nextLine(); // IMPORTANTE: Consumir el salto de línea pendiente tras `nextInt()` 

            switch (op) {
                case 1: // Opción para añadir nombres
                    String op2;  // Se declara la variable fuera del `do-while` para que su ámbito incluya la condición del `while`
                    do {
                        System.out.print("Nombre a añadir: ");
                        String n1 = sc.nextLine(); // Se captura el nombre
                        gestor.anadirNom(n1); // Se llama al método para añadirlo
                        
                        // Preguntar si quiere añadir otro
                        System.out.print("¿Quiere añadir otro nombre? S/N: ");
                        op2 = sc.nextLine(); // Se lee la respuesta del usuario
                    } while (op2.equalsIgnoreCase("S")); // Se usa `equalsIgnoreCase` para aceptar "S" en mayúsculas o minúsculas
                    break;


                case 2: // Opción para eliminar un nombre
                    System.out.print("Nombre a eliminar: ");
                    String n2 = sc.nextLine(); // Se captura el nombre a eliminar
                    gestor.eliminarNom(n2); // Se llama al método de eliminación
                    break;

                case 3: // Opción para mostrar la lista
                    System.out.println("Lista actualizada: ");
                    gestor.mostrarNom(); // Se llama al método para mostrar los nombres
                    break;

                case 4: // Opción para salir del programa
                    System.out.println("Hasta pronto");
                    sc.close();  // Se cierra el Scanner antes de salir
                    return; // Finaliza la ejecución del programa

                default: // Caso para opciones no válidas
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;  // Sale del `switch`, pero el `while` sigue ejecutándose y muestra el menú otra vez
            }
        }
    }
}

/*
Sistema de Gestión de Nombres: crea un programa en Java que permita gestionar una lista de nombres utilizando ArrayList.

Lista inicial: "Ana", "Luis", "Marta", "Carlos" (ya deben estar en el ArrayList).
Opciones del programa:

1️⃣ Añadir nombres:

El usuario podrá introducir nuevos nombres manualmente.
Se podrá añadir varios nombres en un bucle hasta que el usuario decida parar.
2️⃣ Buscar y eliminar un nombre:

El programa pedirá un nombre y verificará si existe en la lista.
Si el nombre está, se eliminará.
Si no está, se mostrará un mensaje adecuado.
3️⃣ Mostrar la lista actualizada después de cada operación.

1️⃣ Método añadirNombre(String nombre) → Para que el usuario pueda agregar nuevos nombres.
2️⃣ Método eliminarNombre(String nombre) → Para buscar y eliminar un nombre si existe.
3️⃣ Método mostrarNombres() → Para mostrar la lista actualizada.

*/

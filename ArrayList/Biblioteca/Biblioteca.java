import java.util.ArrayList;
import java.util.Scanner;

//Clase Biblioteca
public class Biblioteca {
    //Atributos que piden
    private ArrayList<Libro> libros;
    private int numLibros;

    //Constructor
    public Biblioteca(){
        this.libros=new ArrayList<>();  //así se construye el array vacío 
        this.numLibros=0;
    }

    //Método añadir libro creado - cuando creo un elemento del ArrayList directamente
    public void añadirlibroCreado(Libro book){
        libros.add(book);
        numLibros++;
    }

    //Método añadir libro - cuando creo un elemento Libro a partir de sus atributos pero no lo uso en el programa... algo he hecho  mal
    public void añadirLibro(String titulo, int numPaginas, String estado){
        Libro nuevoLibro = new Libro(titulo, "sin ISBN", numPaginas);
        libros.add(nuevoLibro);
        numLibros++;
    }

    //Método borrar libro   
    public int borrarLibro(String titulo){
        for(int i=0;i<libros.size();i++){
            if(libros.get(i).getTitulo().equalsIgnoreCase(titulo)){  //para que acepte bien aunque me equivoque con May o Minus
                libros.remove(i);
                numLibros--;
                return 1;
            }

        }
        return 0;  //Si no encuentra el libro para borrar devuelve un 0. Me sirve para el main
    }

    //Método mostrar libro
    public void mostrarLibros(){
        System.out.println("Lista actualizada: ");
        for(Libro l : libros){
            System.out.println("Título: " +l.getTitulo());  //sólo muestro el título, podría seguir añadiendo cosas para mostrar más propiedades. No sé cómo mostrar directamente el elemento del Array
        }
    }


    /*Main punto de acceso al programa
    * Menú infinito con las opciones:
    * Añadir libro. Borrar libro. Mostrar libros de la biblioteca.
    */
    public static void main(String[] args){
        Biblioteca biblio = new Biblioteca();
        Scanner sc=new Scanner(System.in);
        while(true){
            
            System.out.print("Opciones: A) Añadir libro, B) Borrar libro, C) Mostrar libros, X) Salir: ");
            String op=sc.nextLine().toUpperCase();  //Hay que ponerlo fuera porque si es dentro del do, el while no lo reconoce
            System.out.println();
            switch(op){
                case "A":
                    System.out.print("Introduzca el título: ");
                    String tit=sc.nextLine();
                    System.out.println();
                    System.out.print("Introduzca el número de páginas: ");
                    int np=sc.nextInt();
                    sc.nextLine();
                    System.out.println();
                    System.out.print("Introduzca el estado: ");
                    String estado=sc.nextLine();
                    biblio.añadirLibro(tit,np,estado);
                    break; //sale del switch pero no del while
                case "B":
                    System.out.print("Diga el título que quiere borrar: ");
                    String borrado=sc.nextLine();
                    int resultado = biblio.borrarLibro(borrado);
                    if (resultado == 1) {
                        System.out.println("Libro eliminado con éxito.");
                    } else {
                        System.out.println("El libro no se encontró en la biblioteca.");
                    }
                    break;
                case "C":
                    biblio.mostrarLibros();
                    break;
                case "X":
                System.out.println("Goodbye");    
                sc.close();
                    return; //sale del main directamente
                default:
                    System.out.println("Opción no válida");
                    break;

            }
            
        }

    }
}
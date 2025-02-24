import java.util.ArrayList;
public class Biblioteca {
    //Atributos
    private ArrayList<Libro> libros;
    private int numLibros;

    //Método añadir libro creado
    public void añadirlibroCreado(Libro book){
        this.libros=new ArrayList<>();
        libros.add(book);
        numLibros++;
    }

    //Método añadir libro   
    public void añadirLibro(String titulo, int numPaginas, String estado){
        Libro nuevoLibro = new Libro(titulo, "sin ISBN", numPaginas);
        libros.add(nuevoLibro);
        numLibros++;
    }

    //Método borrar libro   
    public int borrarLibro(String titulo){
        for(int i=0;i<libros.size();i++){
            if(libros.get(i).getTitulo().equals(titulo)){
                libros.remove(i);
                numLibros--;
                return 1;
            }

        }
        return 0;
    }

}

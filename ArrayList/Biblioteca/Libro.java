public class Libro {
    //Atributos
    private String titulo;
    private String ISBN;
    private int pag;

    //Método Constructor
    public Libro (String titulo, String ISBN, int pag){
        this.titulo=titulo;
        this.ISBN=ISBN;
        this.pag=pag;
    }

    //Métodos set
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    } 
    public void setNumPag(int pag){
        this.pag=pag;
    }  

    //Métodos get
    public String getTitulo(){
        return this.titulo;
    }
    public String getISBN(){
        return this.ISBN;
    }
    public int getNumPag(){
        return this.pag;
    }
}

public class Product{
    //Atributos
    private String nombre;
    private double precio;
    private int stock;

    //Constructor
    public Product (String nombre, double precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }

    //Métodos set
    public void setNombre(String n){
        this.nombre=n;
    }
    public void setPrecio(double p){
        this.precio=p;
    }
    public void setStock(int s){
        this.stock=s;
    }

    //Métodos get
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getStock{
        return this.stock;
    }

    //Método vender
    public boolean vender(int cantidad){
        if(cantidad<=this.stock){
            this.stock -= cantidad;
            return true;
        }
        else{
            System.out.println("No hay stock suficiente");
            return false;
        }
    }

    //Método reponer
    public reponer(int cantidad){
        this.stock += cantidad;
    }

}
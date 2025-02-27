import java.util.ArrayList;

//Superclase
class Dispositivo{
  //Atributos
  protected String nombre;
  protected String marca;
  //Constructor
  public Dispositivo(String nombre, String marca){
    this.nombre=nombre;
    this.marca=marca;
  }

//Método encender
  public void encender(){}
}

//Subclase teléfono
class Telefono extends Dispositivo{
  //Atributos propio no tiene

  //Constructor
  public Telefono (String nombre, String marca){
    super(nombre,marca);
  }
  //Método sobrescrito
  @Override
  public void encender(){
    System.out.println("El teléfono se está encendiendo: Beep Beep");
  }
}

//Subclase Computadora
class Computadora extends Dispositivo{
    //Atributos propios no tiene
    //Constructor
 
  public Computadora (String nombre,String marca){
      super(nombre,marca);
    }
    //Método sobrescrito
    @Override
    public void encender(){
      System.out.println("La computadora se está encendiendo: Chh Chh");
    }
}
public class GestionDispositivos{
  public static void main(String[] args){
    //Constructor de la clase no se usa
    //Creación ArrayList
    ArrayList<Dispositivo> listaDisp = new ArrayList<>(); 
    listaDisp.add(new Dispositivo("impresora","Epson"));
    listaDisp.add(new Telefono("iPhone","13 Midnight"));
    listaDisp.add(new Computadora("PC","Intel 7"));

    //Llamada a método con for-each
    for(Dispositivo dis: listaDisp){
      dis.encender();
    }
  }
}   


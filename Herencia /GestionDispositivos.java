import java.util.ArrayList

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
    super(nombre,marca)
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
  public void encender 


//superclase es abstracta, atributos protected y constructor public
abstract class Animal {
    //Atributos
    protected String nombre;
    //Constructor
    public Animal(String nombre){
        this.nombre=nombre;
    }
    //Método hacer sonido
    abstract public void hacerSonido();  //OJO cuando el método es abstract, no tiene {} y termina en ;
    public void mostrarNombre(){
        System.out.println("El nombre del animal es: " +this.nombre);
    }

}
class Perro extends Animal{
    //atributos propios no tiene
    //Constructor
    public Perro (String nombre){
        super(nombre);
    }
    //Métodos
    @Override
    public void hacerSonido(){
        System.out.println("El perro hace guau guau");
    }
}
class Gato extends Animal{
    //atributos propios no tiene
    //Constructor
    public Gato (String nombre){
        super(nombre);
    }
    //Métodos
    @Override
    public void hacerSonido(){
        System.out.println("El gato hace miau miau");
    }
}
public class AnimalMain{
    public static void main(String[] args){
        //Constructores de las subclases, instanciar objetos subclases
        Perro perro1=new Perro("Robi");
        Gato gato1=new Gato("Michu");
        perro1.mostrarNombre();
        perro1.hacerSonido();
        gato1.hacerSonido();
        gato1.mostrarNombre();
    }
}
import java.util.ArrayList;

class Animal {
   
    //Atributos superclase
    protected String nombre;
    protected int edad;

    //Constructor
     public Animal(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
     }

     //Método hacerSonido

     public void hacerSonido(){
     }

}

class Perro extends Animal{
    //Atributos los mismos de Animal, no hay que hacer nada

    //Constructor
    public Perro(String nombre, int edad){
        super(nombre,edad);
    }

    //Método sobrescrito
    @Override
    public void hacerSonido(){
        System.out.println("El perro hace: ¡Guau!");
    }
}

class Gato extends Animal{
    //Atributos igual a Animal
    //Constructor
    public Gato(String nombre, int edad){
        super(nombre,edad);
    }

    //Método sobrescrito
    @Override
    public void hacerSonido(){
        System.out.println("El gato hace: ¡Miau!");
    }
}

public class Animales{
    //Llamada al main
    public static void main(String[] args){
        //Creación ArrayList
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        listaAnimales.add(new Perro("Rufo",3));
        listaAnimales.add(new Gato("Michi",12));

        //Recorrido por el ArrayList
        for (Animal ani : listaAnimales){
            ani.hacerSonido();
        }
    }

}
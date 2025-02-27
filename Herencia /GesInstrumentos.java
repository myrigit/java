import java.util.ArrayList;

class Instrumento {
    //Atributos
    protected String nombre;
    protected String tipo;
    //Constructor
    public Instrumento(String nombre, String tipo){
        this.nombre=nombre;
        this.tipo=tipo;
    }
    //Método tocar
    public void tocar(){
    }
}

class Guitarra extends Instrumento{
    //Atributos propios no tiene, hereda los de la superclase
    //Constructor
    public Guitarra(String nombre,String tipo){
        super(nombre,tipo);
    }
    //Método tocar sobrescrito
    @Override
    public void tocar(){
        System.out.println("La guitarra suena: Strum Strum");
    }
}

class Piano extends Instrumento{
    //atributos propios no tiene, hereda de la superclase
    //Constructor
    public Piano(String nombre,String tipo){
        super(nombre,tipo);
    }
    //Método tocar sobrescrito
    @Override
    public void tocar(){
        System.out.println("El piano suena: Tum Tum");
    }
}

public class GesInstrumentos{  //Clase que contiene al main
    public static void main(String[] args){
        ArrayList<Instrumento> listaInstrumentos=new ArrayList<>();
        listaInstrumentos.add(new Guitarra("Tesoro","eléctrica"));
        listaInstrumentos.add(new Piano("Teclado","cola"));
   

        //Recorrido listaInstrumentos
        for(Instrumento ins : listaInstrumentos){
            ins.tocar();
        }
    }
}
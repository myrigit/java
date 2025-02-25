import java.util.ArrayList;
class Vehiculo{
    //Atributos
    protected String marca;   //atributos de la superclase protected
    protected String modelo;

    //Constructor
    public Vehiculo (String marca, String modelo){   //hacerlo público
        this.marca=marca;
        this.modelo=modelo;
    }

    //Método sonidoMotor
    public void sonidoMotor(){    //se deja vacío, no hace nada, las subclases lo van a sobreescribir
    }
}

class Coche extends Vehiculo{
    //Atributos  no hay que hacer nada, lo hereda de la superclase

    //Constructor
    public Coche(String marca, String modelo){
        super(marca,modelo);
    }

    //Método sonidoMotor
    @Override
    public void sonidoMotor(){
        System.out.println("El coche hace: Vroom Vroom");
    }
}
 class Moto extends Vehiculo{
    //Atributos no hay que hacer nada

    //Constructor
    public Moto (String marca, String modelo){
        super(marca,modelo);
    }

    //Método sonidoMotor
    @Override
    public void sonidoMotor(){
        System.out.println("La motocicleta hace: Brr Brr");
    }

 }


public class GestionVehiculos {   //es la clase donde se llama al método principal main
    public static void main(String[] args){
        //creación ArrayList 
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(new Coche("Citroen", "C4"));
        listaVehiculos.add(new Moto("Yamaha","Y-250"));

        //Recorrer ArrayList polimorfismo
        for(Vehiculo veh : listaVehiculos){
            veh.sonidoMotor();
        }
    }
}

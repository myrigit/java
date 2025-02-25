import java.util.ArrayList;

class Empleado{  //Superclase
    //Atributos
    protected String nombre;
    protected double salario;

    //Constructor
    public Empleado (String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
    }

    //Métodos
    public double calcularBono(){
        return 0;  //voy a suponer que para un empleado sin referencia de cargo el bono es 0
    }
    public void mostrarInfo(){
       /* String n=this.nombre;
        *double s=this.salario;
        *  No es necesario declarar las variables a imprimir*/
        System.out.print("Nombre empleado: " +this.nombre + "Salario: " +this.salario);  // No le pongo ln porque después tiene que aparecer al lado el bono
    }

}

class Gerente extends Empleado{    //Subclase de Empleado
    //Atributos los mismos que Empleado, no hay que hacer nada más
    //Constructor
    public Gerente (String nombre, double salario){
        super(nombre, salario); //subclase de la superclase Empleado
    }

    //Método sobrescrito
    @Override
    public double calcularBono(){   //no tengo que pasarle el salario porque ya lo tiene de la clase Empleado
        return salario*0.2;  //devuelve el bono
    } 
}

class Desarrollador extends Empleado{    //Otra subclase de empleado
    //Atributos los mismos
    //Constructor
    public Desarrollador(String nombre, double salario){
        super(nombre,salario);
    }
     //Método sobrescrito
     @Override
     public double calcularBono(){  //no tengo que pasarle el salario porque ya lo tiene de la clase Empleado
        
        return salario*0.1;  //devuelve el bono
     } 

}

public class MainEmpleados{  //Siempre se me olvida!!
    public static void main(String[] args){
        
        //Creación ArrayList
        ArrayList<Empleado> listaEmpleados=new ArrayList<>();

        //le meto algunos empleados de prueba
        listaEmpleados.add(new Gerente ("Myriam Jiménez", 4000));
        listaEmpleados.add(new Desarrollador("Jaime Botella", 2850.50));
        listaEmpleados.add(new Empleado("Irene Botella", 2000.80));

        //Recorrer la lista para sacar nombre y bono
        for(Empleado emp : listaEmpleados){
            emp.mostrarInfo();
            System.out.println(" Bono: " +emp.calcularBono());
        }  

    }
}


/*
1. Crea una superclase Empleado con:
    • Atributos: nombre, salario.
    • Método calcularBono(), que será sobrescrito en las subclases.
    • Método mostrarInfo(), que imprime todos los atributos del empleado
2. Crea subclases Gerente y Desarrollador que hereden de Empleado y sobrescriban
calcularBono():
    • Gerente: El bono es el 20% del salario.
    • Desarrollador: El bono es el 10% del salario.
3. En el main(), usa un ArrayList<Empleado> para almacenar distintos tipos de
empleados y recorrer la lista mostrando el bono de cada uno.
 */
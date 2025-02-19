public class Termo {
    //Atributos
    private double temperatura;
    private String unidad;

    //Constructor
    public Termo (double temperatura, String unidad){
        this.temperatura=temperatura;
        this.unidad=unidad;
    }
   
    //Métodos set y get

    public void setTemp(double temperatura){
        this.temperatura=temperatura;
    }
    public double getTemp(){
        return this.temperatura;
    }
    
}
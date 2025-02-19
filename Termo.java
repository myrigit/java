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
    public void setUnidad(String unidad){
        this.unidad=unidad;
    }

    public double getTemp(){
        return this.temperatura;
    }
    public String getUnidad(){
        return this.unidad;
    }
    
    //Método convertir
    public double convertir(){
        if setUnidad=C  
            double tempF=(setTemperatura*9/5)+32;
        elif setUnidad=F 
            double tempC=(setTemperatura-32)+5/9;
        else
            System.out.println("Unidad no válida");
    }


}
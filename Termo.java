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
        if (getUnidad().equals("C")){
            this.temperatura=(this.temperatura*9.0/5.0)+32;
            setUnidad("F"); //ahora la unidad es  F
            return this.temperatura;
        }  
            
        else if (getUnidad().equals("F")){
            this.temperatura=(this.temperatura-32)+5.0/9.0;
            setUnidad("C"); //ahora la unidad es C
            return this.temperatura;
        }
        else{
            System.out.println("Unidad no válida");
            return Double.NaN
        }
    }


}
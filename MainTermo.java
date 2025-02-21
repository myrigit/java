public class MainTermo {
    //Punto de acceso al programa
    public static void main (String[] args){
        //Creación del objeto (instancia)
        Termo termo1 = new Termo(25,"C"); //para entenderme, termo1 es una variable de tipo Termo
    //Llamada al método convertir
    
    System.out.println("Temperatura original " +termo1.getTemp() +" " + termo1.getUnidad());
    System.out.println("Temperatura convertida " +termo1.convertir() +" " +termo1.getUnidad());
    System.out.println("Temperatura de nuevo convertida " +termo1.convertir() +" " +termo1.getUnidad());
    }
}

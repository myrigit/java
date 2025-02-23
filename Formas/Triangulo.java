package Formas;
public class Triangulo {
    //Método forma asteriscos
    public void forma(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
       }
      //  return  no hace falta porque es void
    }
    public static void main(String[] args) {
        Triangulo tri=new Triangulo();
        tri.forma();
    }
}

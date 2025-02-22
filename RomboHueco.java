import java.util.Scanner;
public class RomboHueco {

    //Método forma lo voy a hacer estático esta vez
    public static void forma(int n){
    //Primera pirámide
        int m=(n-1)/2+1;
        //Primera fila
        for(int j=1;j<=(m-1);j++){
            System.out.print(" ");
        }
        System.out.println("*");

        //Filas hasta la mitad
        for(int i=2;i<=m;i++){
            for(int j=1;j<=(m-i);j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1;j<=(2*i-3);j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //Pirámide invertida
        //a partir de la fila siguiente a la más ancha
        int k=(n-1)/2;
        for(int i=1;i<=k-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.print("*");

           for(int e=1;e<=n-2*(i+1);e++){
                    System.out.print(" ");
            }
            System.out.println("*");           
        }
        //Última fila            
        for(int u=1;u<=(n-1)/2;u++){
            System.out.print(" ");
        }
        System.out.println("*");
    }
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un número impar de filas: ");
        int n=sc.nextInt();
        forma(n);
        sc.close();
       }  
    
}

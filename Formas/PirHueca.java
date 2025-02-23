package Formas;
import java.util.Scanner;
public class PirHueca{
    public void forma(int n){ //n filas de la forma
        //primera fila que es peculiar
        for (int k=1;k<=(n-1);k++){
            System.out.print(" ");
        }
        System.out.println("*");
        //Filas intermedias
        for(int i=2;i<=(n-1);i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int e=1;e<=2*i-3;e++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        //Última fila
        for(int k=1;k<=2*n-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }   

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número de filas: ");
        int n = sc.nextInt();

        PirHueca ph = new PirHueca();
        ph.forma(n);

        sc.close();
    }
    
}

/*
 * Fila 1 --> 1 * en el centro (posición n-1) - salto de línea
 * Filas intermedias --> (n-i) espacios - 1* - (2i-3) espacios - 1* - salto de línea
 * Fila última --> todo asteriscos (2n-1) y después salto de línea
 * 
 * Introduce número de filas: 7
      *
     * *
    *   *
   *     *
  *       *
 *         *
*************
 * 
 */
package Sentencias_control;
import java.util.Scanner;
public class NumPrimos {
    
    //Método esPrimo
    public boolean esPrimo(int num){
        /*recorro desde 2 hasta el número anterior, 
        si encuentra algún número que al dividirlo por él dé 0 entonces es que es divisible y por tanto no primo
        devuelve falso y sale del método. La única forma de salir con true es si no ha encontrado divisores */
        if (num <= 1) {  // Los números <=1 no son primos
            return false;
        }
        for(int i=2;i<=num-1;i++){
            if(num %i ==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        NumPrimos np=new NumPrimos();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para saber si es primo :");
        int n = sc.nextInt();
        if (np.esPrimo(n)){
            System.out.println("El número " +n +" es primo");
        }
        else{
            System.out.println("El número " +n +" NO es primo");
        }
        sc.close();
    }   

}

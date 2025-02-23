import java.util.Scanner;
public class EntradaDatos{

    //punto inicio programa
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    //creo un objeto tipo Scanner
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();                    //método de Scanner para leer un entero
        System.out.println("Has introducido el número " +num);
        sc.close();
    }
}





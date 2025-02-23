public class MainCuenta{
    /// Método main: punto de entrada del programa
    public static void main(String [] args){
       // Nuevo objeto: llamada a constructor con valores atributos
        Cuenta cuenta1 = new Cuenta("Ana López", 1000.0);

        //Llamada para depositar 500
        cuenta1.depositar(500);
        System.out.println("Tu nuevo saldo es " + cuenta1.getSaldo());

        //Llamada para retirar 200
        
        boolean exitoRetirada = cuenta1.retirar(200);
        if (exitoRetirada)
            System.out.println("Tu nuevo saldo es " + cuenta1.getSaldo());
        
        boolean exitoRetirada2 = cuenta1.retirar(2000);
        if (exitoRetirada2)
            System.out.println("Tu nuevo saldo es " + cuenta1.getSaldo());
            
     /* Otra forma de hacerlo no tan óptima pero que funciona
        if (cuenta1.retirar(200)) 
            System.out.println("Tu nuevo saldo es " + cuenta1.getSaldo());
        
       Llamada para retirar 2000
       if (cuenta1.retirar(2000)) 
           System.out.println("Tu nuevo saldo es " + cuenta1.getSaldo());
     */
    }
}
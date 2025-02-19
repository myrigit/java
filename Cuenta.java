public class Cuenta {
    //Atributos
    private String titular;
    private double saldo;

    //Constructores
    public Cuenta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    //Métodos set. en este caso no tiene sentido setSaldo, mejor crear otros métodos de depositar y retirar
    public void setTitular(String titular){
        this.titular = titular;
    }
    //Métodos get
    public String getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
    }

    //Método depositar
    public void depositar(double cantidad){
        this.saldo += cantidad;
    }
    //Método retirar
    public boolean retirar(double retiro){
        if (retiro <= this.saldo)  {
            this.saldo -= retiro;
            return true;
        }
        else {
            System.out.println("Saldo insuficiente");
            return false;
        }
            
        
    }

}
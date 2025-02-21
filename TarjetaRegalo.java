public class TarjetaRegalo {
    //Atributos
    private String titular;
    private double saldo;
    private int validez;

    //Constructor
    public TarjetaRegalo(String titular, double saldo, int validez){
        this.titular = titular;
        this.saldo=saldo;
        this. validez=validez;
    }

    //Métodos set
    public void setTitular(String titular){
        this.titular=titular;
    }
    public void setValidez(int validez){
        this.validez=validez;
    }

    //Métodos get
    public String getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public int getValidez(){
        return this.validez;
    }

    //Método recargar
    public void recargar(double cantidad){
        this.saldo += cantidad;
    }

    //Método usar tarjeta
    public boolean usar(double cantidad){
        if (cantidad<=this.saldo){
            this.saldo -= cantidad;
            return true;
        }
        else{
            System.out.println("No tiene suficiente saldo");
            return false;
        }
    }

        //Método reducir Validez
        public boolean reducirValidez(int dias){
                this.validez -= dias;
                System.out.println("Le quedan " +this.validez +" de validez a su tarjeta");
                return true;
            }
        
}

/*
 Crea una clase TarjetaRegalo con:

Atributos privados: titular (String), saldo (double), validez (int, número de días hasta que expira la tarjeta).
Constructor: que inicialice los tres atributos.
Métodos getTitular(), getSaldo(), getValidez().
Método recargar(double cantidad): aumenta el saldo.
Método usar(double cantidad): Resta la cantidad del saldo.
No permite realizar pagos si el saldo es insuficiente.
Si el saldo es insuficiente, muestra "Saldo insuficiente en la tarjeta".
Método reducirValidez(int dias): reduce los días restantes hasta la expiración.
Si la validez llega a 0, la tarjeta ya no se puede usar.
 */

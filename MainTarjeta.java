public class MainTarjeta {
    //declaración
    public static void main(String[] args){

        //Instancia (Objeto)
        TarjetaRegalo treg1 = new TarjetaRegalo("Ana Martín",50.0,30);

        //IMprimir información inicial
        System.out.println("Tarjeta regalo de " +treg1.getTitular() + " - Saldo inicial: " +treg1.getSaldo()+"€ y validez de " +treg1.getValidez() +" dias");
        
        //llamada a método recargar
        double recarga=20;
        treg1.recargar(recarga);
        System.out.println("Recarga realizada: " + recarga +"€. Saldo actual: " + treg1.getSaldo() + "€");

        //llamada a método usar
        /*
        double compra=100;
        if(treg1.usar(compra)){   //verifica si hay saldo para comprar
        System.out.println("Compra realizada: " +compra +"€. Saldo actual: " + treg1.getSaldo() + "€");
        } //si no hay saldo no hay que hacer nada, ya lo hace el método usar

        */
        // Alternativa con booleano
        double compra=100;
        boolean exitoCompra = treg1.usar(compra);
        if(exitoCompra){   
        System.out.println("Compra realizada: " +compra +"€. Saldo actual: " + treg1.getSaldo() + "€");
        } 
        

        //llamada reducir validez
        int reduccion=10;
        treg1.reducirValidez(reduccion);
        System.out.println("Validez reducida en " +reduccion +" días. Días restantes: " +treg1.getValidez());
    }
}
/*
1️⃣ Crear una tarjeta de regalo para "Ana Martín" con saldo inicial de 50.0€ y validez de 30 días.
2️⃣ Recargar 20.0€.
3️⃣ Intentar comprar algo de 60.0€ (debería permitirlo).
4️⃣ Intentar comprar algo de 20.0€ (debería impedirlo por saldo insuficiente).
5️⃣ Reducir la validez en 10 días y mostrar los días restantes.

Tarjeta de regalo de Ana Martín - Saldo inicial: 50.0€ - Validez: 30 días
Recarga realizada: 20.0€. Saldo actual: 70.0€
Compra realizada: 60.0€. Saldo actual: 10.0€
Saldo insuficiente en la tarjeta para realizar la compra de 20.0€. Saldo actual: 10.0€
Validez reducida en 10 días. Días restantes: 20
*/
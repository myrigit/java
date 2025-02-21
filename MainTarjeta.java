import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MainTarjeta {
    //declaración
    public static void main(String[] args){

    //Instancia (Objeto)
    TarjetaRegalo treg1 = new TarjetaRegalo("Ana Martín",50.0,30);

    //IMprimir información inicial
    System.out.println("Tarjeta regalo de "+treg1.titular + " - Saldo inicial: " +treg1.saldo+"€ y validez de "+treg1.validez" +" dias);
    
    //Llamadas a método recargar

    treg1.recargar(20);
    System.out.println("");

    
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
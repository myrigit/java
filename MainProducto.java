public class MainProducto{
    //punto de acceso al programa mail
    public static void main(String[] args){
        
        //Crear instancia (objeto)
        Producto producto1 = new Producto("Camiseta",19.90,10);

        //IMprimir información inicial
        System.out.println("Producto : " +producto1.getNombre() +"- Precio: " +producto1.getPrecio() + " €" +"-Stock inicial: " +producto1.getStock() +" unidades");
        //vender 3 unidades
        int cantidadVenta1 = 3;
        boolean exitoVenta1  = producto1.vender(cantidadVenta1);
        if (exitoVenta1){
            System.out.println("Venta realizada: " +cantidadVenta1 +" unidades vendidas. Stock restante: " + producto1.getStock());
        }
        //vender 10 unidades
        int cantidadVenta2 = 10;
        boolean exitoVenta2  = producto1.vender(cantidadVenta2);
        if (exitoVenta2){
            System.out.println("Venta realizada: " +cantidadVenta2 +" unidades vendidas. Stock restante: " + producto1.getStock());
        }

        //Reponer 5 unidades
        int cantidadRepuesto = 5;
        producto1.reponer(cantidadRepuesto);
        System.out.println("Stock repuesto: " +cantidadRepuesto +" unidades añadidas. Stock actual: " +producto1.getStock());

        }

    }

/* Producto: Camiseta - Precio: 19.99€ - Stock inicial: 10 unidades
Venta realizada: 3 unidades vendidas. Stock restante: 7
No hay suficiente stock para vender 10 unidades.
Stock repuesto: 5 unidades añadidas. Stock actual: 12
*/
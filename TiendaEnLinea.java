public class TiendaEnLinea {
    public static void main(String[] args) {
        // VARIABLES DE LA TIENDA
        // Mensajes de la aplicación
        String mensajeBienvenida = "Bienvenido a nuestra tienda en línea, ";
        String mensajeConfirmacion = ", tu pedido ha sido confirmado ";
        String mensajeMostrarTotal = "El total de tu compra es: $";

        // Variables de productos (agrega las tuyas a continuación)
        double precioLibro = 15.99;
        double precioCamiseta = 25.50;
        double precioPantalon = 26.90;
        double precioZapatos = 39.90;

        // Variables de clientes (agrega las tuyas a continuación)
        String cliente1 = "Ana";
        String cliente2 = "Alex";
        String cliente3 = "Miguel";

        // Estado de pedidos (agrega las tuyas a continuación)
        boolean pedidoConfirmadoCliente1 = true;
        boolean pedidoConfirmadoCliente2 = true;
        boolean pedidoConfirmadoCliente3 = true;

        // INTERACCIÓN DE LA APLICACIÓN
        // Ana
        System.out.println(mensajeBienvenida + cliente1); // Muestra "Bienvenido a nuestra tienda en línea, Ana"
        if(pedidoConfirmadoCliente1 == true) {
            System.out.println(mensajeConfirmacion + mensajeMostrarTotal + precioPantalon);
        }

        // Miguel
        System.out.println(mensajeBienvenida + cliente3);
        if(pedidoConfirmadoCliente3 == true) {
            System.out.println(mensajeConfirmacion + mensajeMostrarTotal + (precioZapatos + precioLibro));
            System.out.println(mensajeConfirmacion + mensajeMostrarTotal + ((precioZapatos + precioLibro) - (precioCamiseta + precioPantalon)));
        }

        // Alex
        System.out.println(mensajeBienvenida + cliente2);
        if(pedidoConfirmadoCliente2 == true) {
            System.out.println(mensajeConfirmacion + mensajeMostrarTotal + (precioZapatos * 2 + precioCamiseta + precioPantalon));
        }
    }
}

/*  int a = 10, b = 20; 
    System.out.println((a > b) ? "A es mayor" : "B es mayor");
 */

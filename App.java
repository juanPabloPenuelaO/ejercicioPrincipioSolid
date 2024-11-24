public class App {

    public static void main(String[] args) {

        // Prueba para crear métodos de envío
        MetodoEnvio envioNormal = new EnvioNormal();
        MetodoEnvio envioUrgente = new EnvioUrgente();

        // prueba para crear productos
        Producto producto1 = new Producto("teclado", 60000.00);
        Producto producto2 = new Producto("camiseta", 30000.00);

        // Prueba para crear un pedido normal
        Pedido pedidoNormal = new Pedido(envioNormal);
        pedidoNormal.agregarProducto(producto1);
        pedidoNormal.agregarProducto(producto2);
        pedidoNormal.mostrarResumen();
        pedidoNormal.procesarPedido();

        // prueba para crear pedido express
        PedidoExpress pedidoExpress = new PedidoExpress(envioUrgente);
        pedidoExpress.agregarProducto(producto1);
        pedidoExpress.agregarSeguroEnvio();
        pedidoExpress.mostrarResumen();
        pedidoExpress.procesarPedido();
    }
}

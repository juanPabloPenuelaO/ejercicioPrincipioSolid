public class PedidoExpress extends Pedido {

    public PedidoExpress(MetodoEnvio metodoEnvio) {
        super(metodoEnvio);
    }

    public void agregarSeguroEnvio() {
        System.out.println("Seguro de envío express agregado.");
    }
}

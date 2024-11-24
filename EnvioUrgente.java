public class EnvioUrgente implements MetodoEnvio {

    @Override
    public void calcularCostoEnvio(double totalPedido) {
        System.out.println("el costo del envio urgente es: " + (totalPedido * 0.15)); //el costo de envío será el 15% del total del pedido
    }

    @Override
    public void procesarEnvio() {
        System.out.println("el envio urgente está en proceso");
    }
}

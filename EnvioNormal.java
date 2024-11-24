public class EnvioNormal implements MetodoEnvio {

    @Override
    public void calcularCostoEnvio(double totalPedido) {
        System.out.println("el costo del envio normal calculado: " + (totalPedido * 0.1)); // simulando que el costo de envio será el 10% del total del pedido

    }

    @Override
    public void procesarEnvio() {
        System.out.println("envio normal en proceso");
    }
}

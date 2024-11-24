import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos; // productos en el pedido
    private MetodoEnvio metodoEnvio;

    public Pedido(MetodoEnvio metodoEnvio) {
        this.productos = new ArrayList<>();
        this.metodoEnvio = metodoEnvio;
    }

    // Agrega un producto a la lista de productos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    // muestra el resumen del pedido
    public void mostrarResumen() {
        double total = productos.stream().mapToDouble(Producto::getPrecio).sum();
        System.out.println("resumen del pedido:");
        productos.forEach(p -> System.out.println("- " + p.getNombre() + ": $" + p.getPrecio()));
        System.out.println("Total del pedido: " + total);
        metodoEnvio.calcularCostoEnvio(total);
    }

    public void procesarPedido() {
        System.out.println("se esta procesando el pedido...");
        metodoEnvio.procesarEnvio();
    }
}

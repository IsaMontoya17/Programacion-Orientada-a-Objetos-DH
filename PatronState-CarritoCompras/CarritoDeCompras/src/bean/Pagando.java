package bean;

public class Pagando implements StateCarrito{

    private Carrito carrito;

    public Pagando(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("No se pueden agregar más productos");
    }

    @Override
    public void cancelarCarrito() {
        carrito.setEstado(new Vacio(carrito));
        System.out.println("El carrito ha sido CANCELADO");
    }

    @Override
    public void volverPuntoAnterior() {
        carrito.setEstado(new Cargando(carrito));
        System.out.println("El carrito se encuentra ahora CARGANDO");
    }

    @Override
    public void pasarSiguienteEstado() {
        carrito.setEstado(new Cerrado(carrito));
        System.out.println("El carrito se encuentra ahora CERRADO");
    }

    @Override
    public String toString() {
        return "PAGANDO";
    }
}

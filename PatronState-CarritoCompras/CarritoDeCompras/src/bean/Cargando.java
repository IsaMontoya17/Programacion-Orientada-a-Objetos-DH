package bean;

import java.util.List;

public class Cargando implements StateCarrito{

    private Carrito carrito;

    public Cargando(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        carrito.getProductos().add(producto);
    }

    @Override
    public void cancelarCarrito() {
        carrito.setEstado(new Vacio(carrito));
        System.out.println("El carrito ha sido CANCELADO");
    }

    @Override
    public void volverPuntoAnterior() {
        carrito.setEstado(new Vacio(carrito));
        System.out.println("El carrito se encuentra ahora VACIO");
    }

    @Override
    public void pasarSiguienteEstado() {
        carrito.setEstado(new Pagando(carrito));
        System.out.println("El carrito se encuentra ahora PAGANDO");
    }

    @Override
    public String toString() {
        return "CARGANDO";
    }
}

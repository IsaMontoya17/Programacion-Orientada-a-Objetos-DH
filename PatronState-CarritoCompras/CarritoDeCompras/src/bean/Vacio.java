package bean;

public class Vacio implements StateCarrito{

    private Carrito carrito;

    public Vacio(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        carrito.getProductos().add(producto);
        System.out.println("El producto ha sido añadido al carrito exitosamente");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("Su carrito ya esta VACIO");
    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("Su carrito está VACIO, no puede volver al punto anterior");
    }

    @Override
    public void pasarSiguienteEstado() {
        carrito.setEstado(new Cargando(carrito));
        System.out.println("El carrito se encuentra ahora CARGANDO");
    }

    @Override
    public String toString() {
        return "VACIO";
    }
}

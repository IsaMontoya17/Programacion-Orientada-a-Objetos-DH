package bean;

public class Cerrado implements StateCarrito{

    private Carrito carrito;

    public Cerrado(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("La compra ya ha sido realizada, El carrito se encuentra ahora VACIO");
    }

    @Override
    public void cancelarCarrito() {
        carrito.setEstado(new Vacio(carrito));
        System.out.println("La compra ya ha sido realizada, El carrito se encuentra ahora VACIO");
    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("La compra ya ha sido realizada, NO se puede volver al punto anterior");
    }

    @Override
    public void pasarSiguienteEstado() {
        carrito.setEstado(new Vacio(carrito));
        System.out.println("El carrito se encuentra ahora VACIO");
    }

    @Override
    public String toString() {
        return "CERRADO";
    }
}

package bean;

public interface StateCarrito {
    void agregarProducto(Producto producto);
    void cancelarCarrito();
    void volverPuntoAnterior();
    void pasarSiguienteEstado();
}

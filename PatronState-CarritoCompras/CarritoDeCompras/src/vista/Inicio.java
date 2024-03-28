package vista;

import bean.Carrito;
import bean.Producto;

public class Inicio {
    public static void main(String[] args) {
        VistaProducto vProducto = new VistaProducto();
        Producto producto = vProducto.crearProducto();
        Carrito carrito = new Carrito();

        carrito.mostrarEstadoCarrito();
        carrito.agregarProducto(producto);
        carrito.mostrarEstadoCarrito();
        carrito.agregarProducto(producto);
        carrito.mostrarEstadoCarrito();

        /*carrito.mostrarEstadoCarrito();
        carrito.cancelarCarrito();
        carrito.mostrarEstadoCarrito();

        carrito.mostrarEstadoCarrito();
        carrito.volverPuntoAnterior();
        carrito.mostrarEstadoCarrito();

        carrito.mostrarEstadoCarrito();
        carrito.pasarSiguienteEstado();
        carrito.mostrarEstadoCarrito();
        */


    }
}

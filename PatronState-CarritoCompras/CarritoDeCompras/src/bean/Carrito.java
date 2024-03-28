package bean;

import vista.VistaProducto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private StateCarrito estado;
    private List<Producto> productos;

    public Carrito() {

        this.setEstado(new Vacio(this));
        productos = new ArrayList<>();
    }
    public StateCarrito getEstado() {
        return estado;
    }
    public void setEstado(StateCarrito estado) {
        this.estado = estado;
    }
    public List<Producto> getProductos() {
        return productos;
    }
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    //MÉTODOS
    public void agregarProducto(Producto producto){

        VistaProducto vProducto = new VistaProducto();
        Producto product;

        getEstado().agregarProducto(producto);

        if (estado instanceof Vacio) {
            getEstado().pasarSiguienteEstado();

        } else if (estado instanceof Cargando){
            int respuesta;
            do {
                respuesta = JOptionPane.showOptionDialog(null, "¿Desea agregar otro producto?", "Agregar Producto", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No"}, "Sí");
                if(respuesta == JOptionPane.YES_OPTION) {
                    product = vProducto.crearProducto();
                    getEstado().agregarProducto(producto);
                }
            }while(respuesta == JOptionPane.YES_OPTION);

            getEstado().pasarSiguienteEstado();

        } else if (estado instanceof Pagando){
            getEstado().pasarSiguienteEstado();
            estado  = new Cerrado(this);
        } else {
            estado = new Cerrado(this);
        }
    };
    public void cancelarCarrito(){
        getEstado().cancelarCarrito();
    };
    public void volverPuntoAnterior(){
        getEstado().volverPuntoAnterior();
    };
    public void pasarSiguienteEstado(){
        getEstado().pasarSiguienteEstado();
    };

    public void mostrarEstadoCarrito(){
        System.out.println("El estado del carrito es: " + getEstado());
    }

}//CIERRE DE LA CLASE

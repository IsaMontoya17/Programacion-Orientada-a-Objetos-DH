package vista;

import bean.Producto;

import javax.swing.*;

public class VistaProducto {

    public Producto crearProducto(){
        String descripcion = JOptionPane.showInputDialog(null, "Ingrese la descripción del producto:");
        String precioString = JOptionPane.showInputDialog(null, "Ingrese el precio del producto:");

        Double precio = Double.parseDouble(precioString);

        Producto producto = new Producto(descripcion, precio);
        return producto;

    }
}

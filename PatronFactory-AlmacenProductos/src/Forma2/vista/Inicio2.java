package Forma2.vista;

import Forma2.bean.Almacen;
import Forma2.bean.Producto;
import Forma2.factory.ProductoFactory;

import java.util.Scanner;

public class Inicio2 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el tipo de producto: ");
        String tipo= scanner.nextLine();
        tipo = tipo.toUpperCase();
        Almacen almacen = new Almacen();

        try{
            Producto producto= ProductoFactory.crearProducto(tipo);
            double espacio = producto.calcularEspacio();
            almacen.getEspacioproductos().add(espacio);
        }catch (IllegalArgumentException ex){
            System.err.println(ex.getMessage());
        }

        scanner.close();

        scanner.close();
        System.out.println("Espacio necesario en el almacen: " + almacen.calcularEspacioNecesario());

    }
}

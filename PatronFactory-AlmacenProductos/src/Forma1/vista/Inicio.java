package Forma1.vista1;

import Forma1.bean.Almacen;
import Forma1.bean.Producto;
import Forma1.factory.CajaFactory;
import Forma1.factory.PelotaFactory;
import Forma1.factory.ProductoFactory;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el tipo de producto: ");
        String tipo= scanner.nextLine();
        tipo = tipo.toUpperCase();
        Almacen almacen = new Almacen();

        switch (tipo){
            case "CAJA10X10":
                ProductoFactory productoFactory1 = new CajaFactory();
                Producto caja = productoFactory1.crearProducto(tipo);
                double espacioCaja = caja.calcularEspacio();
                almacen.getEspacioproductos().add(espacioCaja);
                break;
            case "PELOTAFUTBOL":
                ProductoFactory productoFactory2 = new PelotaFactory();
                Producto pelotaFutbol = productoFactory2.crearProducto(tipo);
                double espacioPelota1 = pelotaFutbol.calcularEspacio();
                almacen.getEspacioproductos().add(espacioPelota1);
                break;
            case "PELOTATENIS":
                ProductoFactory productoFactory3 = new PelotaFactory();
                Producto pelotaTenis = productoFactory3.crearProducto(tipo);
                double espacioPelota2 = pelotaTenis.calcularEspacio();
                almacen.getEspacioproductos().add(espacioPelota2);
                break;
            default:
                System.out.println("el tipo no corresponde");
                break;
        }

        scanner.close();
        System.out.println("Espacio necesario en el almacen: " + almacen.calcularEspacioNecesario());

    }
}

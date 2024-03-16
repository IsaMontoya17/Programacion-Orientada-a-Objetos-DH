package vista;

import bean.Contenedor;
import bean.Pais;
import bean.Puerto;
import logica.LPuerto;

import java.util.ArrayList;
import java.util.List;

public class Inicio {
    public static void main(String[] args) {

        Puerto puerto = new Puerto("Puerto1");
        LPuerto lPuerto = new LPuerto();

        Contenedor contenedor1= new Contenedor(123, Pais.DESCONOCIDA, true);
        Contenedor contenedor2= new Contenedor(321, Pais.DESCONOCIDA, true);
        Contenedor contenedor3= new Contenedor(111, Pais.EEUU, true);
        Contenedor contenedor4= new Contenedor(80, Pais.BRASIL, false);
        Contenedor contenedor5= new Contenedor(66, Pais.RUSIA, true);
        Contenedor contenedor6= new Contenedor(70, Pais.CANADA, false);
        Contenedor contenedor7= new Contenedor(221, Pais.DESCONOCIDA, false);
        Contenedor contenedor8= new Contenedor(432, Pais.CHINA, false);
        Contenedor contenedor9= new Contenedor(44, Pais.EEUU, true);

        lPuerto.agregarContenedor(contenedor1, puerto.getContenedores());
        lPuerto.agregarContenedor(contenedor2, puerto.getContenedores());
        lPuerto.agregarContenedor(contenedor3, puerto.getContenedores());
        lPuerto.agregarContenedor(contenedor4, puerto.getContenedores());
        lPuerto.agregarContenedor(contenedor5, puerto.getContenedores());
        lPuerto.agregarContenedor(contenedor6, puerto.getContenedores());
        lPuerto.agregarContenedor(contenedor7, puerto.getContenedores());
        lPuerto.agregarContenedor(contenedor8, puerto.getContenedores());
        lPuerto.agregarContenedor(contenedor9, puerto.getContenedores());

        lPuerto.mostrarContenedoresSegunNumero(puerto.getContenedores());
        int cantidad = lPuerto.cantidadContenedoresPeligrosos(puerto.getContenedores());
        System.out.println("Cantidad de contenedores peligrosos de procedencia desconocida: " + cantidad);

    }
}

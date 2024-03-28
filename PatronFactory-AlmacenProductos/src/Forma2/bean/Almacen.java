package Forma2.bean;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Double> Espacioproductos;

    public Almacen() {
        Espacioproductos = new ArrayList<>();
    }

    public List<Double> getEspacioproductos() {
        return Espacioproductos;
    }

    public void setEspacioproductos(List<Double> espacioproductos) {
        Espacioproductos = espacioproductos;
    }

    public double calcularEspacioNecesario(){
        double espacioTotal=0.0;

        for (Double producto : Espacioproductos) {
            espacioTotal+=producto;
        }

        return espacioTotal;
    }
}

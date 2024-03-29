package vista;

import bean.Circulo;
import bean.FiguraComposite;
import bean.Rectangulo;

public class Inicio {
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(5,4);
        Circulo circulo1 = new Circulo(1);
        Circulo circulo2 = new Circulo(1);
        Circulo circulo3 = new Circulo(1);

        FiguraComposite vagon = new FiguraComposite();
        vagon.agregarFigura(rectangulo);
        vagon.agregarFigura(circulo1);
        vagon.agregarFigura(circulo2);
        vagon.agregarFigura(circulo3);

        double areaTotal = vagon.calcularArea();
        System.out.println("Area total del vagon: " + areaTotal);

    }
}

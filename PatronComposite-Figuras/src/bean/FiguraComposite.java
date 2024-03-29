package bean;

import java.util.ArrayList;
import java.util.List;

public class FiguraComposite implements Figura{

    private List<Figura> figuras;

    public FiguraComposite() {
        figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura figura){
        figuras.add(figura);
    }

    @Override
    public double calcularArea() {
        double area=0;
        for (Figura figura : figuras) {
            area+=figura.calcularArea();
        };
        return area;
    }

    @Override
    public String toString() {
        return "figuras=" + figuras;
    }
}

package Forma2.bean;

public class Pelota extends Producto{

    private double radio;

    public Pelota(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularEspacio() {
        double radio3=Math.pow(radio, 3);
        return (4/3)*Math.PI*radio3;
    }
}

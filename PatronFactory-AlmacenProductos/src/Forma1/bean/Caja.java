package Forma1.bean;

public class Caja extends Producto{

    private double longitud, ancho, altura;

    public Caja(double longitud, double ancho, double altura) {
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public double calcularEspacio() {
        return Math.pow(longitud, 3);
    }
}

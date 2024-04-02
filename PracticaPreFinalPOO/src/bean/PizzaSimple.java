package bean;

public class PizzaSimple extends Pizza{

    private double precio;
    private Boolean esEspecial;

    public PizzaSimple(String nombre, String descripcion, double precio, Boolean esEspecial) {
        super(nombre, descripcion);
        this.precio = precio;
        this.esEspecial = esEspecial;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public double calcularPrecio() {
        double precioPizza;
        if(esEspecial){
            precioPizza = precio*1.7;
        }else{
            precioPizza=precio;
        }
        return precioPizza;
    }
}

package bean;

public class PizzaSimple extends Pizza{

    private int precio;
    private Boolean esEspecial;

    public PizzaSimple(String nombre, String descripcion, int precio, Boolean esEspecial) {
        super(nombre, descripcion);
        this.precio = precio;
        this.esEspecial = esEspecial;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public int calcularPrecio() {
        int precioPizza;
        if(esEspecial){
            precioPizza = (int)Math.round(precio * 1.7);
        } else {
            precioPizza = precio;
        }
        return precioPizza;
    }
}

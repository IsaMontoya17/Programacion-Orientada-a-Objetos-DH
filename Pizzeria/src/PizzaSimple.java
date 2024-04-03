public class PizzaSimple extends Pizza{

    private int precioBase;
    private Boolean esEspecial;

    public PizzaSimple(String nombre, String descripcion, int precioBase, Boolean esEspecial) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.esEspecial = esEspecial;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public Boolean getEsEspecial() {
        return esEspecial;
    }

    @Override
    public int calcularPrecio() {
        int precio;
        if(esEspecial){
            precio = (int)Math.round(precioBase * 1.7);
        }else{
            precio = precioBase;
        }
        return precio;
    }
}

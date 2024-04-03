import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{

    private List<Pizza> pizzas;

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        pizzas = new ArrayList<>();
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void agregarPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    @Override
    public int calcularPrecio() {
        int precioMaximo=0;
        for (Pizza pizza : pizzas) {
            if(pizza.calcularPrecio()>precioMaximo){
                precioMaximo = pizza.calcularPrecio();
            }
        }
        return precioMaximo;
    }
}

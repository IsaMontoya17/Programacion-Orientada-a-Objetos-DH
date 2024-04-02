package bean;

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
    public double calcularPrecio() {
        double precio;
        double precioMaximo=0;
        for (Pizza pizza : pizzas) {
            precio =pizza.calcularPrecio();
            if (precio > precioMaximo) {
                precioMaximo = precio;
            }
        }
        return precioMaximo;
    }
}

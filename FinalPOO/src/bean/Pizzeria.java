package bean;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private List<Pizza> pizzas;

    public Pizzeria() {
        pizzas = new ArrayList<>();
    }

    public void agregarPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    public void informePizzas(){
        for (Pizza pizza : pizzas) {
            if(pizza instanceof PizzaSimple){
                PizzaSimple pizzaSimple = (PizzaSimple) pizza;
                System.out.println("Pizza de " + pizzaSimple.getNombre() + " que tiene un precio base de "
                + pizzaSimple.getPrecio() + " pesos." + "\n");
            } else {
                PizzaCombinada pizzaCombinada = (PizzaCombinada) pizza;
                System.out.println("Pizza combinada " + pizzaCombinada.getNombre() + ", que es mitad "
                + pizzaCombinada.getPizzas().get(0).getNombre() + " y mitad " +
                pizzaCombinada.getPizzas().get(1).getNombre() + " cuyo cálculo de precio nos debería arrojar " +
                pizzaCombinada.calcularPrecio() +  " pesos " + "\n");
            }
        }
    }
}

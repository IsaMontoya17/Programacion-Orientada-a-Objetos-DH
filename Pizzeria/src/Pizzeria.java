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

    public void mostrarPizzas(){
        for (Pizza pizza : pizzas) {
            if(pizza instanceof PizzaSimple){
                if(!((PizzaSimple) pizza).getEsEspecial()) {
                    System.out.println("Pizza de " + pizza.getNombre() + " que tiene un precio base de " + ((PizzaSimple) pizza).getPrecioBase() + " pesos."+ "\n");
                } else{
                    System.out.println("Pizza " + pizza.getNombre() + " especial que tiene un precio base de " + ((PizzaSimple) pizza).getPrecioBase() + " pesos."+ "\n");
                }
            } else{
                System.out.println("Pizza combinada " + pizza.getNombre() + ", que es mitad " + ((PizzaCombinada) pizza).getPizzas().get(0).getNombre() +
                " y mitad " + ((PizzaCombinada) pizza).getPizzas().get(1).getNombre() + ", cuyo cálculo de precio nos debería arrojar " + pizza.calcularPrecio()
                + " pesos."+ "\n");
            }
        }

    }
}

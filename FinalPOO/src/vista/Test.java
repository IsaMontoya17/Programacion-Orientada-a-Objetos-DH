package vista;

import bean.PizzaCombinada;
import bean.PizzaSimple;
import bean.Pizzeria;

public class Test {
    public static void main(String[] args) {
        PizzaSimple pizza1 = new PizzaSimple("muzzarella", "Queso, tomate y albahaca", 700, false);
        PizzaSimple pizza2 = new PizzaSimple("margarita", "Queso, salsa de tomate y pepperoni", 850, true);
        PizzaSimple pizza3 = new PizzaSimple("ananá", "Queso, tomate, pimientos, champiñones", 950, false);

        PizzaCombinada pizzaCombinada1 = new PizzaCombinada("loca", "muy loca");
        pizzaCombinada1.agregarPizza(pizza2);
        pizzaCombinada1.agregarPizza(pizza3);

        Pizzeria pizzeria = new Pizzeria();

        pizzeria.agregarPizza(pizza1);
        pizzeria.agregarPizza(pizza2);
        pizzeria.agregarPizza(pizza3);
        pizzeria.agregarPizza(pizzaCombinada1);

        System.out.println("El precio de la pizza "+ pizza1.getNombre() + " es " + pizza1.calcularPrecio());
        System.out.println("El precio de la pizza "+ pizza2.getNombre() + " es " + pizza2.calcularPrecio());
        System.out.println("El precio de la pizza "+ pizza3.getNombre() + " es " + pizza3.calcularPrecio());
        System.out.println("El precio de la pizza "+ pizzaCombinada1.getNombre() + " es " + pizzaCombinada1.calcularPrecio());

        pizzeria.informePizzas();
    }

}

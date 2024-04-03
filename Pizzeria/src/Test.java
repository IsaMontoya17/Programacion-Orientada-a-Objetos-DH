public class Test {
    public static void main(String[] args) {
        PizzaSimple pizzaSimple1 = new PizzaSimple("muzzarella", "tiene queso", 700, false);
        PizzaSimple pizzaSimple2 = new PizzaSimple("margarita", "muy rica", 850, true);
        PizzaSimple pizzaSimple3 = new PizzaSimple("ananá", "tiene chorizo", 950, false);

        PizzaCombinada pizzaCombinada1 = new PizzaCombinada("loca", "tiene salsa");
        pizzaCombinada1.agregarPizza(pizzaSimple2);
        pizzaCombinada1.agregarPizza(pizzaSimple3);

        Pizzeria pizzeria = new Pizzeria();
        pizzeria.agregarPizza(pizzaSimple1);
        pizzeria.agregarPizza(pizzaSimple2);
        pizzeria.agregarPizza(pizzaSimple3);
        pizzeria.agregarPizza(pizzaCombinada1);

        pizzeria.mostrarPizzas();
    }
}

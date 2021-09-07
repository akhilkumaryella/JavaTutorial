package designpatterns.factory;

/**
 * its an creational design pattern
 * it hides how object is created and provides the object
 *
 * eg: in java we are using Jdbc to make connection to databases like oracle,sql,mysql using connection string
 * we know only jdbc provides the connection but not sure how it connects
 */
public class FactoryDesignPattern {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.OrderPizza("veg");
        pizzaStore.OrderPizza("chicken");
        pizzaStore.OrderPizza("cheese");

    }
}

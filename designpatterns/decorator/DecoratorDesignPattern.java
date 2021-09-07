package designpatterns.decorator;

/**
 * its' an behavioural design pattern
 *
 */
public class DecoratorDesignPattern {

    public static void main(String[] args) {

        Pizza cheesePizzaDecorator = new CheesePizzaDecorator(
                new PlainPizza()
        );
        cheesePizzaDecorator.bake();

        Pizza veggieDecoratorPattern = new VeggiePizzaDecorator(
                new CheesePizzaDecorator(
                        new PlainPizza()
                )
        );
        veggieDecoratorPattern.bake();
    }
}

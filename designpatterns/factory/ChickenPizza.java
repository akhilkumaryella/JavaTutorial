package designpatterns.factory;

public class ChickenPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("preparing chicken pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking chicken pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting chicken pizza");
    }
}

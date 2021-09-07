package designpatterns.flyweight.problem;

/**
 * it's an structural design pattern
 * this is used to save memory
 * In this pattern we are mainly reuse objects
 */
public class FlyWeightDesignPattern {

    public static void main(String[] args) {

        PaintApp app = new PaintApp();
        app.render(10);
    }
}

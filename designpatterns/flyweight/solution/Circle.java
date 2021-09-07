package designpatterns.flyweight.solution;

public class Circle extends Shape {

    private String label;

    public Circle() {
        label = "Circle";
    }


    @Override
    public void draw(int radius, String lineColor, String fillColor) {
        System.out.println("Drawing a " + label
        + " with radius " + radius
        + " Fill color " + fillColor
        + " Line color "+ lineColor);
    }
}

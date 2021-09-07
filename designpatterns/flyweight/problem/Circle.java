package designpatterns.flyweight.problem;

public class Circle implements Shape{

    private String label;
    private int radius;
    private String fillColor;
    private String lineColor;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }

    public Circle() {
        label = "Circle";
    }


    @Override
    public void draw() {
        System.out.println("Drawing a " + label
        + " with radius " + radius
        + " Fill color " + fillColor
        + " Line color "+ lineColor);
    }
}

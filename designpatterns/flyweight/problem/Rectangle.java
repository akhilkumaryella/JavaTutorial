package designpatterns.flyweight.problem;

public class Rectangle implements Shape{

    private String label;
    private int length;
    private int breadth;
    private String fillStyle;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public String getFillStyle() {
        return fillStyle;
    }

    public void setFillStyle(String fillStyle) {
        this.fillStyle = fillStyle;
    }

    public Rectangle() {
        label = "Rectangle";
    }
    @Override
    public void draw() {

        System.out.println("Drawing a " + label
                + " with Length " + length
                + " Breadth " + breadth
                + " FillStyle "+ fillStyle);
    }
}

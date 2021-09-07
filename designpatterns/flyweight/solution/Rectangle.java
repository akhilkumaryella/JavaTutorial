package designpatterns.flyweight.solution;

public class Rectangle extends Shape {

    private String label;

    public Rectangle() {
        label = "Rectangle";
    }


    @Override
    public void draw(int length, int breadth, String fillStyle) {

        System.out.println("Drawing a " + label
                + " with Length " + length
                + " Breadth " + breadth
                + " FillStyle "+ fillStyle);
    }
}

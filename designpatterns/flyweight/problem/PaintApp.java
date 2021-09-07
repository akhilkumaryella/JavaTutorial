package designpatterns.flyweight.problem;

public class PaintApp {

    public void render(int numberOfShapes) {

        Shape[] shapes = new Shape[numberOfShapes + 1];
        for(int i = 1; i < shapes.length; i++) {
            if(i % 2 == 0) {
                // here every time new object will be created  - that's the issue
                shapes[i] = new Circle();
                ((Circle)shapes[i]).setRadius(i);
                ((Circle)shapes[i]).setFillColor("white");
                ((Circle)shapes[i]).setLineColor("red");
                shapes[i].draw();
            } else {
                // here every time new object will be created  - that's the issue
                shapes[i] = new Rectangle();
                ((Rectangle)shapes[i]).setLength(i);
                ((Rectangle)shapes[i]).setBreadth(i + 1);
                ((Rectangle)shapes[i]).setFillStyle("dotted");
                shapes[i].draw();
            }
            System.out.println(shapes[i]);
        }
    }
}

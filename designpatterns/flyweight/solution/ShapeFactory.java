package designpatterns.flyweight.solution;

import java.util.HashMap;

public class ShapeFactory {

    private static HashMap<String, Shape> map = new HashMap();
    static {
        map.put("circle", new Circle());
        map.put("rectangle", new Rectangle());
    }
    public static Shape getShape(String type) {

        return map.get(type);


    }
}

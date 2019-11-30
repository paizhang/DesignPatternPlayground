package creationalpatterns.prototypepattern;

import java.util.HashMap;

public class ShapeStore {

    private HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();

    public ShapeStore() {
        Circle circle = new Circle();
        shapeMap.put("circle", circle);

        Retangle retangle = new Retangle();
        shapeMap.put("retangle", retangle);

        Triangle triangle = new Triangle();
        shapeMap.put("triangle", triangle);
    }

    public Shape getShape(String shapeType) {
        return (Shape)shapeMap.get(shapeType).clone();
    }
}

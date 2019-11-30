package creationalpatterns.prototypepattern;

public class Triangle extends Shape {

    public Triangle() {
        type = "Triangle";
    }

    public void draw() {
        System.out.println("Draw Triangle!");
    }
}

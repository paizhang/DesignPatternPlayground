package creationalpatterns.prototypepattern;

/*
    This is a demo for prototype pattern.

    There are three roles in this pattern. First one is the PrototypeStore who is responsible for cloning prototypes. The second one is Prototype. There
    is a Prototype interface or abstract class which implements the clone function(be aware of two types of cloning: shadow copy and deep copy). And there
    are those concrete prototype class which extends the abstract Prototype class. And the last role is the client who calls the PrototypeStore to
    get the real object by cloning specific prototype.

    Advantages:
    1. Reduce the total number of subclasses. We don't need to write classes for each possible concrete prototype. We can clone one prototype and modify
    its behaviors or properties to use it in a way that we want.
    2. Good encapsulation. It hides the implementation of each concrete prototype class from client.
    3. Clients can switch, add or remove products at run-time.

    Disadvantages:
    1. Sometime implementing clone function is difficult because some internals of the class may be support copying.

 */
public class Main {

    public static void main(String[] args) {

        ShapeStore shapeStore = new ShapeStore();
        Shape circle = shapeStore.getShape("circle");
        circle.draw();

        Shape retangle = shapeStore.getShape("retangle");
        retangle.draw();
    }

}

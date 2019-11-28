package creationalpatterns.factorypattern;

/*
    This is a sample example of factory pattern.
    We have a interface for RoomBuilder which contains three methods: buildRoom(), buildDoor() and buildWindow().
    We have a concrete class BigRoomBuilder which implements the interface RoomBuilder. This class is used to build the big room which will help build
    the BigDoor, BigWindow and also the BigBed.

    The main function in this class will instantiate a BigRoomBuilder. And then use the instance to build the door, window and bed.

    The advantage of the factory pattern are:
    1. Good encapsulation. The client side does not know the implementation of the Product(Door, Window, etc).
    2. Decouple the objects. In case we want to change the implementation of the method in concrete builder class, there is no changes needed in the
    client side.  
 */
public class Main {

    public static void main(String[] args) {
        BigRoomBuilder bigRoomBuilder = new BigRoomBuilder();
        Door door = bigRoomBuilder.buildDoor();
        door.cloesDoor();
        Bed bed = bigRoomBuilder.buildBed();
        bed.setSize("King");
        Window window = bigRoomBuilder.buildWindow();
        window.closeWindow();

        System.out.println("Door: " + door.isOpen());
        System.out.println("Window:" + window.isOpen());
        System.out.println("Size:" + bed.getSize());
    }
}

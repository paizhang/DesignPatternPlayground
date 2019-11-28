package creationalpatterns.factorypattern;

public class BigRoomBuilder implements RoomBuilder {

    public Door buildDoor() {
        return new BigDoor();
    }

    public Bed buildBed() {
        return new BigBed();
    }

    public Window buildWindow() {
        return new BigWindow();
    }
}

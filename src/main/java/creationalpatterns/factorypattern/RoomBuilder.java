package creationalpatterns.factorypattern;

public interface RoomBuilder {

    public Door buildDoor();

    public Bed buildBed();

    public Window buildWindow();
}

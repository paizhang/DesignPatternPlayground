package creationalpatterns.factorypattern;

public class BigDoor implements Door {

    private boolean open = false;

    public boolean isOpen() {
        return open;
    }

    public void openDoor() {
        open = true;
    }

    public void cloesDoor() {
        open = false;
    }
}

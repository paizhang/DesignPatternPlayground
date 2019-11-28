package creationalpatterns.factorypattern;

public class BigWindow implements Window {

    private boolean open = false;

    public boolean isOpen() {
        return open;
    }

    public void openWindow() {
        open = true;
    }

    public void closeWindow() {
        open = false;
    }
}

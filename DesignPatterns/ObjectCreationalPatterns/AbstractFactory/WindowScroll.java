package DesignPatterns.ObjectCreationalPatterns.AbstractFactory;
// Descrete object
public class WindowScroll implements Scroll{
    @Override
    public void goDown() {
        System.out.println("Window tab up.");
    }

    @Override
    public void goUp() {
        System.out.println("Window tab down.");
    }
}

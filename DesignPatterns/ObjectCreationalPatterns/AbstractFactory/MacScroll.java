package DesignPatterns.ObjectCreationalPatterns.AbstractFactory;
// Descrete object
public class MacScroll implements Scroll{
    @Override
    public void goDown() {
        System.out.println("Mac tab up.");
    }

    @Override
    public void goUp() {
        System.out.println("Mac tab down.");
    }
}

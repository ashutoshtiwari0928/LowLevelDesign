package DesignPatterns.ObjectCreationalPatterns.AbstractFactory;
// Descrete object
public class MacOSButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Mac button clicked!");
    }

    @Override
    public void paint() {
        System.out.println("Mac button painted.");
    }
}

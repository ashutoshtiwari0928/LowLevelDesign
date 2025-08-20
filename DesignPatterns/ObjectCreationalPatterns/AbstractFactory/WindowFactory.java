package DesignPatterns.ObjectCreationalPatterns.AbstractFactory;
// Descrete factory
public class WindowFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Scroll createScroll() {
        return new WindowScroll();
    }
}

package DesignPatterns.ObjectCreationalPatterns.AbstractFactory;
// Descrete factory
public class MacOSFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Scroll createScroll() {
        return new MacScroll();
    }
}

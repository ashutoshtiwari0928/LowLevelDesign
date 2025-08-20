package DesignPatterns.ObjectCreationalPatterns.AbstractFactory;

//Abstract factory
public interface GuiFactory {

    Button createButton();
    Scroll createScroll();
}

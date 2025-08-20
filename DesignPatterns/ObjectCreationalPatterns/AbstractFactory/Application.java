package DesignPatterns.ObjectCreationalPatterns.AbstractFactory;
//Class that defines the application class
public class Application {
    private final Button button;
    private final Scroll scroll;

    public Application(GuiFactory factory){
        this.button = factory.createButton();
        this.scroll = factory.createScroll();
    }

    public void renderUI(){
        button.paint();
        scroll.goUp();
        scroll.goDown();
    }
}

package DesignPatterns.StructuralPatterns.Decorator;

interface TextViewer{
    void render();
}

class PlainTextviewer implements TextViewer{
    private final String text;

    public PlainTextviewer(String text) {
        this.text = text;
    }

    @Override
    public void render(){
        System.out.println(text);
    }
}

abstract class TextDecorator implements TextViewer{
    protected final TextViewer inner;

    public TextDecorator(TextViewer textViewer) {
        this.inner = textViewer;
    }
}

class BoldDecorator extends TextDecorator{
    public BoldDecorator(TextViewer inner){
        super(inner);
    }
    @Override
    public void render(){
        System.out.println("<b>");
        inner.render();
        System.out.println("</b>");
    }
}
public class TextRenderer {
}

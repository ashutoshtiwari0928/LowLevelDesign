package DesignPatterns.StructuralPatterns.Decorator;

interface TextView{
    void render();
}
class BoldTextView implements TextView{
    @Override
    public void render(){
        System.out.println("Bold text render.");
    }
}

class ItalicTextView implements TextView{
    @Override
    public void render(){
        System.out.println("Italic text render");
    }
}

class BoldItalicTextView implements TextView{
    @Override
    public void render(){
        System.out.println("Bold + italic text view");
    }
}

public class TextRenderNaive {
    public static void main(String[] args) {
        TextView bolded = new BoldTextView();
        bolded.render();
        TextView italic = new ItalicTextView();
        italic.render();
        TextView boldedItalic = new BoldItalicTextView();
        boldedItalic.render();
        Dog d  = new Dog();
        d.bark();
    }
}

class Dog{
    public void bark(){

    }
}
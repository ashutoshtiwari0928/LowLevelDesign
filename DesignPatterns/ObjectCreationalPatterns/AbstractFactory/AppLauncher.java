package DesignPatterns.ObjectCreationalPatterns.AbstractFactory;
//This is the entry point of the application

public class AppLauncher {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        Application app;
        if(os.startsWith("Windows")){
            app = new Application(new WindowFactory());
        }
        else app = new Application(new MacOSFactory());
        app.renderUI();
    }
}

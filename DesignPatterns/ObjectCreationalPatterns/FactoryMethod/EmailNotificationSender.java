package DesignPatterns.ObjectCreationalPatterns.FactoryMethod;

public class EmailNotificationSender implements NotificationSender{
    @Override
    public void send(String msg) {
        System.out.printf("Sending msg via email: %s\n",msg);
    }
}

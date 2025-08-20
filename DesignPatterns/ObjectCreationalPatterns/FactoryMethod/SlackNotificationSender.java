package DesignPatterns.ObjectCreationalPatterns.FactoryMethod;

public class SlackNotificationSender implements NotificationSender{
    @Override
    public void send(String msg) {
        System.out.printf("Sending msg via slack: %s\n",msg);
    }
}

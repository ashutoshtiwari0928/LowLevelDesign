package DesignPatterns.ObjectCreationalPatterns.FactoryMethod;

public class SmsNotificationSender implements NotificationSender{
    @Override
    public void send(String msg) {
        System.out.printf("Sending msg via sms: %s\n",msg);
    }
}

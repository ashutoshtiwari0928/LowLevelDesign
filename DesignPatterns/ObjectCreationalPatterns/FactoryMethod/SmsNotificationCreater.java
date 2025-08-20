package DesignPatterns.ObjectCreationalPatterns.FactoryMethod;

public class SmsNotificationCreater extends NotificationCreater{
    @Override
    public NotificationSender createNotification() {
        return new SmsNotificationSender();
    }
}

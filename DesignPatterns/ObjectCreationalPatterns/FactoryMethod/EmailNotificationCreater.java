package DesignPatterns.ObjectCreationalPatterns.FactoryMethod;

public class EmailNotificationCreater extends NotificationCreater{
    @Override
    public NotificationSender createNotification() {
        return new EmailNotificationSender();
    }
}

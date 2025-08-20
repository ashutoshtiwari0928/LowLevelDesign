package DesignPatterns.ObjectCreationalPatterns.FactoryMethod;

public class SlackNotificationCreater extends NotificationCreater{
    @Override
    public NotificationSender createNotification() {
        return new SlackNotificationSender();
    }
}

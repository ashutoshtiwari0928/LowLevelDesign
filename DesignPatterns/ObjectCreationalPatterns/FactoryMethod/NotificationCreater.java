package DesignPatterns.ObjectCreationalPatterns.FactoryMethod;

public abstract class NotificationCreater {
    public abstract NotificationSender createNotification();
    public void send(String msg){
        NotificationSender notificationSender = createNotification();
        notificationSender.send(msg);
    }
}

package DesignPatterns.ObjectCreationalPatterns.FactoryMethod;

public class Application {
    public static void main(String[] args) {
        NotificationCreater creater;
        creater = new EmailNotificationCreater();
        creater.send("Otp is 8932");

        creater = new SmsNotificationCreater();
        creater.send("Otp is 8932");

        creater = new SlackNotificationCreater();
        creater.send("Otp is 8932");

    }
}

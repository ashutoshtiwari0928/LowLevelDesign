package SOLIDPrinciples.SRP.BadCode;

public class Invoice {
    private double amount;


    public Invoice(double amount) {
        this.amount = amount;
    }

    public void generateInvoice() {
        System.out.println("Generating Invoice...");
    }

    public void saveToDatabase() {
        System.out.println("Saving Invoice...");
    }

    public void sendEmailNotification() {
        System.out.println("Sending Email Notification...");
    }
}

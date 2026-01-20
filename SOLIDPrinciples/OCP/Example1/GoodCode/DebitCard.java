package SOLIDPrinciples.OCP.Example1.GoodCode;

public class DebitCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment Method: DebitCard, amount: " + amount);
    }
}

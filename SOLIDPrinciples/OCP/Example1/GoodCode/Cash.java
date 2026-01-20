package SOLIDPrinciples.OCP.Example1.GoodCode;

public class Cash implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment Method: Cash, amount: " + amount);
    }
}

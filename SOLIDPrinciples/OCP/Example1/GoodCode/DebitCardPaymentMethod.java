package SOLIDPrinciples.OCP.Example1.GoodCode;

public class DebitCardPaymentMethod implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment Method: DebitCardPaymentMethod, amount: " + amount);
    }
}

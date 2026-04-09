package SOLIDPrinciples.OCP.Example1.GoodCode;

public class CreditCardPaymentMethod implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment Method: CreditCardPaymentMethod, amount: " + amount);
    }
}

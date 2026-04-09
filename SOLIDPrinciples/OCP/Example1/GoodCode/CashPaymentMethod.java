package SOLIDPrinciples.OCP.Example1.GoodCode;

public class CashPaymentMethod implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment Method: CashPaymentMethod, amount: " + amount);
    }
}

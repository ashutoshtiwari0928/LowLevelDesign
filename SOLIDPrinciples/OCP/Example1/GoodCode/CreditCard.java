package SOLIDPrinciples.OCP.Example1.GoodCode;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment Method: CreditCard, amount: " + amount);
    }
}

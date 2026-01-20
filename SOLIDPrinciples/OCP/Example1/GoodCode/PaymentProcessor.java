package SOLIDPrinciples.OCP.Example1.GoodCode;

public class PaymentProcessor {
    public void processsPayment(PaymentMethod paymentMethod, double amount){
        paymentMethod.pay(amount);
    }
}

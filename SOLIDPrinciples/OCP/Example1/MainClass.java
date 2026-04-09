package SOLIDPrinciples.OCP.Example1;

import SOLIDPrinciples.OCP.Example1.GoodCode.CashPaymentMethod;
import SOLIDPrinciples.OCP.Example1.GoodCode.CreditCardPaymentMethod;
import SOLIDPrinciples.OCP.Example1.GoodCode.PaymentProcessor;

public class MainClass {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processsPayment(new CashPaymentMethod(),100);
        paymentProcessor.processsPayment(new CreditCardPaymentMethod(),200);
//        paymentProcessor.processsPayment("CashPaymentMethod",100);
    }
}

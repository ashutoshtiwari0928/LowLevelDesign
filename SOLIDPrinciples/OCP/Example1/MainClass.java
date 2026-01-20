package SOLIDPrinciples.OCP.Example1;

import SOLIDPrinciples.OCP.Example1.GoodCode.Cash;
import SOLIDPrinciples.OCP.Example1.GoodCode.CreditCard;
import SOLIDPrinciples.OCP.Example1.GoodCode.PaymentProcessor;

public class MainClass {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processsPayment(new Cash(),100);
        paymentProcessor.processsPayment(new CreditCard(),200);
//        paymentProcessor.processsPayment("Cash",100);
    }
}

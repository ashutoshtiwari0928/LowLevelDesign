package SOLIDPrinciples.OCP.Example1.BadCode;

public class PaymentProcessor {
    public void processsPayment(String paymentMethod, double amount){
        if(paymentMethod.equals("CreditCardPaymentMethod")){
            System.out.println("Payment Method: CreditCardPaymentMethod");
        }
        else if(paymentMethod.equals("DebitCardPaymentMethod")){
            System.out.println("Payment Method: DebitCardPaymentMethod");
        }
        else if(paymentMethod.equals("CashPaymentMethod")){
            System.out.println("Payment Method: CashPaymentMethod");
        }
        else{
            System.out.println("Payment Method: Unknown");
        }
    }
}

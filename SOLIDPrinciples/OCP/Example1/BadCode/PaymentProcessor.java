package SOLIDPrinciples.OCP.Example1.BadCode;

public class PaymentProcessor {
    public void processsPayment(String paymentMethod, double amount){
        if(paymentMethod.equals("CreditCard")){
            System.out.println("Payment Method: CreditCard");
        }
        else if(paymentMethod.equals("DebitCard")){
            System.out.println("Payment Method: DebitCard");
        }
        else if(paymentMethod.equals("Cash")){
            System.out.println("Payment Method: Cash");
        }
        else{
            System.out.println("Payment Method: Unknown");
        }
    }
}

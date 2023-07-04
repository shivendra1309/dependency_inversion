//High-level module : doing complex computation
public class PaymentProcessor {
    private final PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public void processPayment(double amount, String accNumber){
        //logic
        paymentGateway.processPayment(amount, accNumber);

    }
}

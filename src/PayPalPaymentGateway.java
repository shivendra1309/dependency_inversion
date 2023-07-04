//low level module: connecting to paypal
public class PayPalPaymentGateway implements PaymentGateway{

    @Override
    public void processPayment(double amount, String accNumber) {
        //integration with paypal api for processing payment

        System.out.println(String.format("Processing payment through Paypal of amount %.2f to account number %s", amount, accNumber));

    }
}

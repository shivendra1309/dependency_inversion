public class StripePaymentGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount, String accNumber) {
        //integration with paypal api for processing payment

        System.out.println(String.format("Processing payment through Stripe of amount %.2f to account number %s", amount, accNumber));

    }
}

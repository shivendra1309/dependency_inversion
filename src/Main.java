public class Main {
    public static void main(String[] args) {
        PaymentGateway paypalPaymentGateway = new PayPalPaymentGateway();
        PaymentProcessor paymentProcessor = new PaymentProcessor(paypalPaymentGateway);
        paymentProcessor.processPayment(100.30, "1234567");

        PaymentGateway stripePaymentGateway = new StripePaymentGateway();
        PaymentProcessor paymentProcessor1 = new PaymentProcessor(stripePaymentGateway);
        paymentProcessor1.processPayment(532.21, "56987445");
    }
}
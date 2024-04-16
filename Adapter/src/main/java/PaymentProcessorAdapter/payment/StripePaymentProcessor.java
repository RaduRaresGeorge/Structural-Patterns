package src.main.java.PaymentProcessorAdapter.payment;

public class StripePaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.print("Processing payment of " + amount + ". ");
    }

    @Override
    public void cancelPayment(double amount, String client) {
        System.out.println("Cancelling payment of " + amount + " for client " + client + ". ");
    }
}

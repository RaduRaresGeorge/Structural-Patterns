package PaymentProcessorAdapter.payment;

public interface PaymentProcessor {
    void processPayment(double amount);
    void cancelPayment(double amount, String client);
}

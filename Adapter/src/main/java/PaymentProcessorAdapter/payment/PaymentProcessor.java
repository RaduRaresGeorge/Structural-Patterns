package src.main.java.PaymentProcessorAdapter.payment;

/**
 * This interface represents a payment processor in the PaymentProcessorAdapter pattern.
 * It provides methods to process and cancel payments.
 */
public interface PaymentProcessor {
    /**
     * Processes a payment of the given amount.
     *
     * @param amount the amount to be paid
     */
    void processPayment(double amount);

    /**
     * Cancels a payment of the given amount for the specified client.
     *
     * @param amount the amount to be cancelled
     * @param client the client for whom the payment is to be cancelled
     */
    void cancelPayment(double amount, String client);
}
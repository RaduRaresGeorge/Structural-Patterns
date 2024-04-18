package src.main.java.PaymentProcessorAdapter.payment;

/**
 * This class represents a Bitcoin payment processor in the PaymentProcessorAdapter pattern.
 * It implements the PaymentProcessor interface and overrides its methods to process and cancel payments.
 */
public class BitCoinPaymentProcessor implements PaymentProcessor {
    /**
     * Processes a payment of the given amount.
     * In this context, it simply prints a message to the console.
     *
     * @param amount the amount to be paid
     */
    @Override
    public void processPayment(double amount) {
        System.out.print("Processing payment of " + amount + ". ");
    }

    /**
     * Cancels a payment of the given amount for the specified client.
     * In this context, it simply prints a message to the console.
     *
     * @param amount the amount to be cancelled
     * @param client the client for whom the payment is to be cancelled
     */
    @Override
    public void cancelPayment(double amount, String client) {
        System.out.println("Cancelling payment of " + amount + " for client " + client + ". ");
    }
}
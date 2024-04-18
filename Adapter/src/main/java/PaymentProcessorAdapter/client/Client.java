package src.main.java.PaymentProcessorAdapter.client;

import src.main.java.PaymentProcessorAdapter.adapter.PaymentAdapter;
import src.main.java.PaymentProcessorAdapter.payment.PaymentProcessor;

/**
 * This class represents a client in the PaymentProcessorAdapter pattern.
 * It contains a PaymentProcessor and a PaymentAdapter, and provides a method to make a payment.
 */
public class Client {
    // The payment processor that this client uses
    private PaymentProcessor paymentProcessor;
    // The payment adapter that this client uses
    private PaymentAdapter paymentAdapter;
    // The name of this client
    private String name;

    /**
     * Constructs a new Client with the given payment processor and name.
     *
     * @param paymentProcessor the payment processor that this client will use
     * @param name the name of this client
     */
    public Client(PaymentProcessor paymentProcessor, String name) {
        this.paymentProcessor = paymentProcessor;
        this.paymentAdapter = new PaymentAdapter(paymentProcessor);
        this.name = name;
    }

    /**
     * Makes a payment with the given amount.
     * This method identifies the payment method using the payment adapter,
     * and then either processes the payment using the payment processor or cancels it,
     * depending on whether the payment method is known.
     *
     * @param amount the amount to be paid
     */
    public void makePayment(double amount) {
        String paymentMethod = paymentAdapter.identifyPaymentMethod();
        if ("Unknown".equals(paymentMethod)) {
            paymentProcessor.cancelPayment(amount, name);
            System.out.println("Payment cancelled due to unknown payment method.");
        } else {
            paymentProcessor.processPayment(amount);
            System.out.println(". Making payment using " + paymentMethod);
        }
    }
}
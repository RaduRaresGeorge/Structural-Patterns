package src.main.java.PaymentProcessorAdapter.adapter;

import src.main.java.PaymentProcessorAdapter.payment.PayPalPaymentProcessor;
import src.main.java.PaymentProcessorAdapter.payment.PaymentProcessor;
import src.main.java.PaymentProcessorAdapter.payment.StripePaymentProcessor;

/**
 * This class represents an adapter for the payment processor.
 * It contains a PaymentProcessor object and provides a method to identify the type of the payment processor.
 */
public class PaymentAdapter {
    // The payment processor that this adapter wraps
    private PaymentProcessor paymentProcessor;

    /**
     * Constructs a new PaymentAdapter with the given payment processor.
     *
     * @param paymentProcessor the payment processor that this adapter will wrap
     */
    public PaymentAdapter(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    /**
     * Identifies the type of the payment processor.
     * This method checks the instance of the payment processor and returns a string representing its type.
     *
     * @return a string representing the type of the payment processor
     */
    public String identifyPaymentMethod() {
        if (paymentProcessor instanceof PayPalPaymentProcessor) {
            return "PayPal";
        } else if (paymentProcessor instanceof StripePaymentProcessor) {
            return "Stripe";
        } else {
            return "Unknown";
        }
    }
}
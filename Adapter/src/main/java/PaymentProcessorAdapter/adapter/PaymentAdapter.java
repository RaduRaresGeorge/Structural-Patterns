package src.main.java.PaymentProcessorAdapter.adapter;

import src.main.java.PaymentProcessorAdapter.payment.PayPalPaymentProcessor;
import src.main.java.PaymentProcessorAdapter.payment.PaymentProcessor;
import src.main.java.PaymentProcessorAdapter.payment.StripePaymentProcessor;

public class PaymentAdapter {
    private PaymentProcessor paymentProcessor;

    public PaymentAdapter(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

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
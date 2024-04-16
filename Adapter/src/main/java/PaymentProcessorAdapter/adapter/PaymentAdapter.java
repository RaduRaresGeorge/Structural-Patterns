package PaymentProcessorAdapter.adapter;

import PaymentProcessorAdapter.payment.PayPalPaymentProcessor;
import PaymentProcessorAdapter.payment.PaymentProcessor;
import PaymentProcessorAdapter.payment.StripePaymentProcessor;

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
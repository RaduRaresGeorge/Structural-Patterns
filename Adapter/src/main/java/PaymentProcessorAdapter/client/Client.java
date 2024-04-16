package src.main.java.PaymentProcessorAdapter.client;

import src.main.java.PaymentProcessorAdapter.adapter.PaymentAdapter;
import src.main.java.PaymentProcessorAdapter.payment.PaymentProcessor;

public class Client {
    private PaymentProcessor paymentProcessor;
    private PaymentAdapter paymentAdapter;
    private String name;

    public Client(PaymentProcessor paymentProcessor, String name) {
        this.paymentProcessor = paymentProcessor;
        this.paymentAdapter = new PaymentAdapter(paymentProcessor);
        this.name = name;
    }

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
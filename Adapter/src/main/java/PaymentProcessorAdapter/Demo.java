package src.main.java.PaymentProcessorAdapter;

import src.main.java.PaymentProcessorAdapter.client.Client;
import src.main.java.PaymentProcessorAdapter.payment.PayPalPaymentProcessor;
import src.main.java.PaymentProcessorAdapter.payment.StripePaymentProcessor;
import src.main.java.PaymentProcessorAdapter.payment.PaymentProcessor;
import src.main.java.PaymentProcessorAdapter.payment.BitCoinPaymentProcessor;

public class Demo {
    public static void main(String[] args) {
        // Create a payment methods
        PaymentProcessor payPalProcessor = new PayPalPaymentProcessor();
        PaymentProcessor stripeProcessor = new StripePaymentProcessor();

        // Create a payment method that is not supported by the adapter.
        PaymentProcessor bitcoinProcessor = new BitCoinPaymentProcessor();

        // Create clients
        Client client1 = new Client(payPalProcessor, "Client 1");
        Client client2 = new Client(stripeProcessor, "Client 2");
        Client client3 = new Client(stripeProcessor, "Client 3");

        // Create a client that uses a payment method that is not supported by the adapter.
        Client client4 = new Client(bitcoinProcessor, "Client 4");

        // Make payments
        client2.makePayment(200.0);
        client1.makePayment(100.0);
        client3.makePayment(150.0);

        // Make a payment using a payment method that is not supported by the adapter.
        client4.makePayment(25.0);

    }
}
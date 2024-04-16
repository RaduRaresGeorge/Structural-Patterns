package EcommerceFacade;

public class Payment {
    public boolean makePayment(String product, double price) {
        // Make payment for the product
        System.out.println("Making payment of $" + price + " for " + product + ".");
        // For simplicity, let's assume the payment is always successful
        return true;
    }
}


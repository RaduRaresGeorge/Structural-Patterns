package src.main.java.EcommerceFacade;

/**
 * This class represents a Payment.
 * It provides a method to make a payment for a product.
 */
public class Payment {
    /**
     * Makes a payment for a product.
     * For simplicity, this method currently always returns true, indicating a successful payment.
     *
     * @param product the product to make a payment for
     * @param price the price of the product
     * @return true if the payment is successful, false otherwise
     */
    public boolean makePayment(String product, double price) {
        // Print a message indicating that the payment is being made
        System.out.println("Making payment of $" + price + " for " + product + ".");
        // For simplicity, let's assume the payment is always successful
        return true;
    }
}

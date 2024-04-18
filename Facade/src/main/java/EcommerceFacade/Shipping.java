package src.main.java.EcommerceFacade;

/**
 * This class represents a Shipping.
 * It provides a method to ship a product to a given address.
 */
public class Shipping {
    /**
     * Ships a product to a given address.
     * For simplicity, this method currently always returns true, indicating a successful shipping.
     *
     * @param product the product to ship
     * @param address the address to ship the product to
     * @return true if the shipping is successful, false otherwise
     */
    public boolean shipProduct(String product, String address) {
        // Print a message indicating that the product is being shipped
        System.out.println("Shipping " + product + " to " + address + ".");
        // For simplicity, let's assume the shipping is always successful
        return true;
    }
}
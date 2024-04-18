package src.main.java.EcommerceFacade;

/**
 * This class represents an Inventory.
 * It provides a method to check if a product is available in the inventory.
 */
public class Inventory {
    /**
     * Checks if a product is available in the inventory.
     * For simplicity, this method currently always returns true.
     *
     * @param product the product to check availability for
     * @return true if the product is available, false otherwise
     */
    public boolean isAvailable(String product) {
        // Print a message indicating that the availability of the product is being checked
        System.out.println("Checking availability of " + product + " in the inventory.");
        // For simplicity, let's assume the product is always available
        return true;
    }
}
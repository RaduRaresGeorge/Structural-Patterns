package src.main.java.EcommerceFacade;

/**
 * This class represents a Client that uses the EcommerceFacade.
 * It creates an EcommerceFacade object and places an order.
 */
public class Client {
    /**
     * The main method which serves as the entry point for the program.
     * It creates an EcommerceFacade object, places an order, and prints the result.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Create a new EcommerceFacade object
        EcommerceFacade ecommerce = new EcommerceFacade();
        // Place an order
        boolean success = ecommerce.placeOrder("Product1", 100.0, "123 Street, City, Country");
        // Print the result of the order
        System.out.println("Order delivered: " + success);
    }
}
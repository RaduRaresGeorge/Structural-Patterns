package src.main.java.EcommerceFacade;

public class Inventory {
    public boolean isAvailable(String product) {
        // Check if the product is available in the inventory
        System.out.println("Checking availability of " + product + " in the inventory.");
        // For simplicity, let's assume the product is always available
        return true;
    }
}


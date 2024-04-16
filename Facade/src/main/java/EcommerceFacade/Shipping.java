package src.main.java.EcommerceFacade;

public class Shipping {
    public boolean shipProduct(String product, String address) {
        // Ship the product to the given address
        System.out.println("Shipping " + product + " to " + address + ".");
        // For simplicity, let's assume the shipping is always successful
        return true;
    }
}
package src.main.java.EcommerceFacade;

public class Client {
    public static void main(String[] args) {
        EcommerceFacade ecommerce = new EcommerceFacade();
        boolean success = ecommerce.placeOrder("Product1", 100.0, "123 Street, City, Country");
        System.out.println("Order delivered: " + success);
    }
}
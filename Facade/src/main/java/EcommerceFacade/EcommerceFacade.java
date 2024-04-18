package src.main.java.EcommerceFacade;

/**
 * This class represents an EcommerceFacade.
 * It provides a method to place an order for a product.
 * The order process involves checking the inventory, making a payment, and shipping the product.
 */
public class EcommerceFacade {
    private final Inventory inventory;
    private final Payment payment;
    private final Shipping shipping;

    /**
     * Constructs an EcommerceFacade object.
     * Initializes the inventory, payment, and shipping objects.
     */
    public EcommerceFacade() {
        this.inventory = new Inventory();
        this.payment = new Payment();
        this.shipping = new Shipping();
    }

    /**
     * Places an order for a product.
     * The order process involves checking the inventory, making a payment, and shipping the product.
     * If any step in the process fails, the method returns false.
     *
     * @param product the product to order
     * @param price the price of the product
     * @param address the address to ship the product to
     * @return true if the order is successful, false otherwise
     */
    public boolean placeOrder(String product, double price, String address) {
        if (!inventory.isAvailable(product)) {
            return false;
        }

        if (!payment.makePayment(product, price)) {
            return false;
        }

        if (!shipping.shipProduct(product, address)) {
            return false;
        }

        return true;
    }
}
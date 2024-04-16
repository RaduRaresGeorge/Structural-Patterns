package EcommerceFacade;

public class EcommerceFacade {
    private final Inventory inventory;
    private final Payment payment;
    private final Shipping shipping;

    public EcommerceFacade() {
        this.inventory = new Inventory();
        this.payment = new Payment();
        this.shipping = new Shipping();
    }

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
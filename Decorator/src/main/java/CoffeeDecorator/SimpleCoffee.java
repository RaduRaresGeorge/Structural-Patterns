package src.main.java.CoffeeDecorator;

/**
 * This class represents a simple coffee.
 * It extends the Coffee class and implements the getCost and getIngredients methods.
 */
public class SimpleCoffee extends Coffee {
    /**
     * Returns the cost of the simple coffee.
     *
     * @return the cost of the simple coffee, which is 1
     */
    @Override
    public double getCost() {
        return 1;
    }

    /**
     * Returns the ingredients of the simple coffee.
     *
     * @return the ingredients of the simple coffee, which is "Coffee"
     */
    @Override
    public String getIngredients() {
        return "Coffee";
    }
}
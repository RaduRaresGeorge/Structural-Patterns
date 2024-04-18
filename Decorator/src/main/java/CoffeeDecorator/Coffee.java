package src.main.java.CoffeeDecorator;

/**
 * This abstract class represents a Coffee.
 * It provides two abstract methods getCost and getIngredients that must be implemented by any class that extends Coffee.
 */
public abstract class Coffee {
    /**
     * Returns the cost of the coffee.
     * This method must be implemented by any class that extends Coffee.
     *
     * @return the cost of the coffee
     */
    public abstract double getCost();

    /**
     * Returns the ingredients of the coffee.
     * This method must be implemented by any class that extends Coffee.
     *
     * @return the ingredients of the coffee
     */
    public abstract String getIngredients();
}
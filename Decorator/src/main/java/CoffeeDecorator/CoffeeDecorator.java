package src.main.java.CoffeeDecorator;

/**
 * This abstract class represents a CoffeeDecorator.
 * It extends the Coffee class and provides a base for other specific coffee decorators.
 * It contains a reference to a Coffee object that can be any concrete coffee or a coffee decorated by other decorators.
 */
public abstract class CoffeeDecorator extends Coffee {
    /**
     * The coffee that is to be decorated.
     */
    protected final Coffee decoratedCoffee;

    /**
     * Constructs a new CoffeeDecorator with the specified coffee.
     *
     * @param decoratedCoffee the coffee to be decorated
     */
    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    /**
     * Returns the cost of the decorated coffee.
     * This method can be overridden by subclasses to add the cost of the decoration.
     *
     * @return the cost of the decorated coffee
     */
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    /**
     * Returns the ingredients of the decorated coffee.
     * This method can be overridden by subclasses to add the ingredients of the decoration.
     *
     * @return the ingredients of the decorated coffee
     */
    public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }
}
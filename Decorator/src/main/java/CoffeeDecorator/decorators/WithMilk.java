package src.main.java.CoffeeDecorator.decorators;

import src.main.java.CoffeeDecorator.CoffeeDecorator;
import src.main.java.CoffeeDecorator.Coffee;

/**
 * This class represents a CoffeeDecorator that adds milk to a coffee.
 * It extends the CoffeeDecorator class and overrides the getCost and getIngredients methods.
 */
public class WithMilk extends CoffeeDecorator {
    /**
     * Constructs a new WithMilk decorator with the specified coffee.
     *
     * @param decoratedCoffee the coffee to be decorated
     */
    public WithMilk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    /**
     * Returns the cost of the decorated coffee plus the cost of milk.
     *
     * @return the cost of the decorated coffee plus 0.5
     */
    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    /**
     * Returns the ingredients of the decorated coffee plus milk.
     *
     * @return the ingredients of the decorated coffee plus ", Milk"
     */
    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }
}

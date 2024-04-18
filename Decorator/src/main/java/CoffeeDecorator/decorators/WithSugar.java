package src.main.java.CoffeeDecorator.decorators;

import src.main.java.CoffeeDecorator.CoffeeDecorator;
import src.main.java.CoffeeDecorator.Coffee;

/**
 * This class represents a CoffeeDecorator that adds sugar to a coffee.
 * It extends the CoffeeDecorator class and overrides the getCost and getIngredients methods.
 */
public class WithSugar extends CoffeeDecorator {
    /**
     * Constructs a new WithSugar decorator with the specified coffee.
     *
     * @param decoratedCoffee the coffee to be decorated
     */
    public WithSugar(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    /**
     * Returns the cost of the decorated coffee plus the cost of sugar.
     *
     * @return the cost of the decorated coffee plus 0.2
     */
    @Override
    public double getCost() {
        return super.getCost() + 0.2;
    }

    /**
     * Returns the ingredients of the decorated coffee plus sugar.
     *
     * @return the ingredients of the decorated coffee plus ", Sugar"
     */
    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Sugar";
    }
}

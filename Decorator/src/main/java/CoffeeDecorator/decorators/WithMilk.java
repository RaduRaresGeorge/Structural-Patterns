package src.main.java.CoffeeDecorator.decorators;

import src.main.java.CoffeeDecorator.CoffeeDecorator;
import src.main.java.CoffeeDecorator.Coffee;

public class WithMilk extends CoffeeDecorator {
    public WithMilk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() {
        return super.getCost() + 0.5;
    }

    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }
}

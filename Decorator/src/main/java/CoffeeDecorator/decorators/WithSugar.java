package src.main.java.CoffeeDecorator.decorators;

import src.main.java.CoffeeDecorator.CoffeeDecorator;
import src.main.java.CoffeeDecorator.Coffee;

public class WithSugar extends CoffeeDecorator {
    public WithSugar(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() {
        return super.getCost() + 0.2;
    }

    public String getIngredients() {
        return super.getIngredients() + ", Sugar";
    }
}


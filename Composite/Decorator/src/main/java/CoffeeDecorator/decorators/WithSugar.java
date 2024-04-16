package CoffeeDecorator.decorators;

import CoffeeDecorator.CoffeeDecorator;
import CoffeeDecorator.Coffee;

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


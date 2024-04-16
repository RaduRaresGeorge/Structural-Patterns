package src.main.java.CoffeeDecorator;

import src.main.java.CoffeeDecorator.decorators.WithMilk;
import src.main.java.CoffeeDecorator.decorators.WithSugar;

public class Demo {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new WithMilk(coffee);
        coffee = new WithSugar(coffee);

        System.out.println("Cost: " + coffee.getCost()); // Outputs: "Cost: 1.7"
        System.out.println("Ingredients: " + coffee.getIngredients()); // Outputs: "Ingredients: Coffee, Milk, Sugar"
    }
}

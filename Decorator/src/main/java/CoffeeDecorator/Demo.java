package src.main.java.CoffeeDecorator;

import src.main.java.CoffeeDecorator.decorators.WithMilk;
import src.main.java.CoffeeDecorator.decorators.WithSugar;

/**
 * This class demonstrates the use of the decorator pattern in the context of a coffee ordering system.
 * It creates a simple coffee and decorates it with milk and sugar.
 * Finally, it prints the cost and ingredients of the decorated coffee.
 */
public class Demo {
    /**
     * The main method that serves as the entry point for the application.
     * It creates a simple coffee, decorates it with milk and sugar, and prints its cost and ingredients.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee coffee = new SimpleCoffee();

        // Decorate the coffee with milk
        coffee = new WithMilk(coffee);

        // Decorate the coffee with sugar
        coffee = new WithSugar(coffee);

        // Print the cost of the decorated coffee
        System.out.println("Cost: " + coffee.getCost()); // Outputs: "Cost: 1.7"

        // Print the ingredients of the decorated coffee
        System.out.println("Ingredients: " + coffee.getIngredients()); // Outputs: "Ingredients: Coffee, Milk, Sugar"
    }
}
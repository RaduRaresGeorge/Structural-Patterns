package src.main.java.ClientServiceAdapter.client;

/**
 * This class represents a client in the Client-Service Adapter pattern.
 * It provides a method to execute a task.
 */
public class Client {

    /**
     * This method is used to execute a task.
     * In this context, it simply prints a message to the console.
     */
    public void execute() {
        System.out.println("Executing client...");
    }
}
package src.main.java.ClientServiceAdapter;

import src.main.java.ClientServiceAdapter.client.Client;
import src.main.java.ClientServiceAdapter.service.Service;
import src.main.java.ClientServiceAdapter.adapter.ClientServiceAdapter;

/**
 * This class represents a demonstration of the Client-Service Adapter pattern.
 * It creates a service, wraps it in a ClientServiceAdapter (which is a type of Client),
 * and then executes the client.
 */
public class Demo {
    /**
     * The main method of the Demo class.
     * It creates a Service, wraps it in a ClientServiceAdapter, and then executes the client.
     *
     * @param args command line arguments. This program does not use command line arguments.
     */
    public static void main(String[] args) {
        // Create a new Service
        Service service = new Service();

        // Create a new ClientServiceAdapter, passing the service to its constructor
        // The ClientServiceAdapter is a type of Client, so we can store it in a Client variable
        Client client = new ClientServiceAdapter(service);

        // Execute the client
        client.execute();
    }
}


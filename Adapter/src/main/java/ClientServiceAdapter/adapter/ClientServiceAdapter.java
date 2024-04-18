package src.main.java.ClientServiceAdapter.adapter;

import src.main.java.ClientServiceAdapter.client.Client;
import src.main.java.ClientServiceAdapter.service.Service;

/**
 * This class represents an adapter for the client service.
 * It extends the Client class and overrides its execute method.
 * The purpose of this class is to allow a client to execute a service
 * without knowing the details of how the service is implemented.
 */
public class ClientServiceAdapter extends Client {
    // The service that this adapter wraps
    private Service service;

    /**
     * Constructs a new ClientServiceAdapter with the given service.
     *
     * @param service the service that this adapter will wrap
     */
    public ClientServiceAdapter(Service service) {
        this.service = service;
    }

    /**
     * Executes the service.
     * This method overrides the execute method in the Client class.
     * It prints a message to the console and then calls the executeService method on the service.
     */
    @Override
    public void execute() {
        System.out.println("Executing client through adapter...");
        service.executeService();
    }
}
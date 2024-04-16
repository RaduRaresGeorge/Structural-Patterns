package src.main.java.ClientServiceAdapter.adapter;

import src.main.java.ClientServiceAdapter.client.Client;
import src.main.java.ClientServiceAdapter.service.Service;

public class ClientServiceAdapter extends Client {
    private Service service;

    public ClientServiceAdapter(Service service) {
        this.service = service;
    }

    @Override
    public void execute() {
        System.out.println("Executing client through adapter...");
        service.executeService();
    }
}
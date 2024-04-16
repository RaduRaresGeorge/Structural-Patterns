package ClientServiceAdapter.adapter;

import ClientServiceAdapter.client.Client;
import ClientServiceAdapter.service.Service;

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
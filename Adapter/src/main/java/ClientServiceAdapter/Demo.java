package src.main.java.ClientServiceAdapter;

import src.main.java.ClientServiceAdapter.client.Client;
import src.main.java.ClientServiceAdapter.service.Service;
import src.main.java.ClientServiceAdapter.adapter.ClientServiceAdapter;

public class Demo {
    public static void main(String[] args) {
        Service service = new Service();
        Client client = new ClientServiceAdapter(service);
        client.execute();
    }
}



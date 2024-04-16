package ClientServiceAdapter;

import ClientServiceAdapter.client.Client;
import ClientServiceAdapter.service.Service;
import ClientServiceAdapter.adapter.ClientServiceAdapter;

public class Demo {
    public static void main(String[] args) {
        Service service = new Service();
        Client client = new ClientServiceAdapter(service);
        client.execute();
    }
}



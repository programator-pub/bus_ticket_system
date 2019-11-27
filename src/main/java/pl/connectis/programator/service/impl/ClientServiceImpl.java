package pl.connectis.programator.service.impl;

import pl.connectis.programator.dao.DB;
import pl.connectis.programator.model.Client;
import pl.connectis.programator.model.Ticket;
import pl.connectis.programator.service.ClientService;

import java.util.List;

public class ClientServiceImpl implements ClientService {

    public Client buyTicket(Client client, Ticket ticket) throws Exception{
        Client clientCustomer = this.getClient(client);
        clientCustomer.addNewTicket(ticket);
        DB.deleteClientFromList(client);
        DB.addClientToList(clientCustomer);
        return clientCustomer;
    }

    private Client getClient(Client client) throws Exception{
        Client dbClient = DB.getClientList().stream()
                .filter(client1 -> client1.equals(client)).findAny()
                .orElseThrow(() -> new Exception("Client not found"));
        return dbClient;
    }

    public List<Client> getAll() {
        return DB.getClientList();
    }

    @Override
    public Client registerClient(String firstName, String secondName) {
        return DB.addClientToList(new Client(firstName, secondName));
    }
}

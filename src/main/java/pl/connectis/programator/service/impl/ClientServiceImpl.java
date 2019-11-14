package pl.connectis.programator.service.impl;

import pl.connectis.programator.dao.DB;
import pl.connectis.programator.model.Client;
import pl.connectis.programator.model.Ticket;

public class ClientServiceImpl {

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
}

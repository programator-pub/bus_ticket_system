package pl.connectis.programator.service.impl;

import org.springframework.stereotype.Service;
import pl.connectis.programator.dao.DB;
import pl.connectis.programator.model.Client;
import pl.connectis.programator.model.Route;
import pl.connectis.programator.model.Ticket;
import pl.connectis.programator.service.WorkerService;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class SupervisiorServiceImpl implements WorkerService {

    @Override
    public Client registerClient(String firstName, String secondName) {
        return DB.addClientToList(new Client(firstName, secondName));
    }

    @Override
    public Client updateClientData(Client client, String firstName, String secondName) throws Exception {
        Client clientToUpdate = this.getClient(client);
        DB.deleteClientFromList(client);
        clientToUpdate.setFirstName(firstName);
        clientToUpdate.setSecondName(secondName);
        DB.addClientToList(clientToUpdate);
        return clientToUpdate;
    }

    @Override
    public Client sellTicketToClient(Client client, Ticket ticket) throws Exception {
        Client clientCustomer = this.getClient(client);
        clientCustomer.addNewTicket(ticket);
        DB.deleteClientFromList(client);
        DB.addClientToList(clientCustomer);
        return clientCustomer;
    }

    @Override
    public List<Client> getAllClients() {
        return DB.getClientList();
    }

    @Override
    public Route addNewRoute(BigDecimal price, String start, String destination, LocalDateTime tripDuration) {
        return DB.addRouteToList(new Route(price, start, destination, tripDuration));
    }

    private Client getClient(Client client) throws Exception{
        Client dbClient = DB.getClientList().stream()
                .filter(client1 -> client1.equals(client)).findAny()
                .orElseThrow(() -> new Exception("Client not found"));
        return dbClient;
    }
}

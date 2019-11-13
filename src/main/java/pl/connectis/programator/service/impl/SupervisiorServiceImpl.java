package pl.connectis.programator.service.impl;

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
        return DB.setClientList(new Client(firstName, secondName));
    }

    @Override
    public Client updateClientData(Client client, String firstName, String secondName) throws Exception{
        Client dbClient = DB.getClientList().stream()
                .filter(client1 -> client1.equals(client)).findAny()
                .orElseThrow(() -> new Exception("Client not found"));
        dbClient.setFirstName(firstName);
        dbClient.setFirstName(secondName);
        return dbClient;
    }

    @Override
    public Client sellTicketToClient(Client client, Ticket ticket) {
        return null;
    }

    @Override
    public List<Client> getAllClients() {
        return null;
    }

    @Override
    public Route addNewRoute(BigDecimal price, String start, String destination, LocalDateTime tripDuration) {
        return null;
    }
}

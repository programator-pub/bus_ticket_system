package pl.connectis.programator.service.impl;

import pl.connectis.programator.dao.DB;
import pl.connectis.programator.model.Client;
import pl.connectis.programator.model.Route;
import pl.connectis.programator.model.Ticket;
import pl.connectis.programator.service.WorkerService;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class WorkerServiceImpl implements WorkerService {

    @Override
    public Client registerClient(String firstName, String secondName) {
        return null;
    }

    @Override
    public Client updateClientData(Client client, String firstName, String secondName) throws Exception {
        Optional<Client> clientOptional = Optional.ofNullable(DB.getClientList().stream()
                .filter(client1 -> client1.equals(client)).findFirst().get());

        return clientOptional.get();

    }

    @Override
    public Client sellTicketToClient(Client client, Ticket ticket) throws Exception {
        return null;
    }

    @Override
    public List<Client> getAllClients() {
        return null;
    }

    @Override
    public Route addNewRoute(BigDecimal price, String start, String destination, Duration tripDuration) {
        return null;
    }
}

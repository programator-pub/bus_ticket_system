package pl.connectis.programator.service;

import pl.connectis.programator.model.Client;
import pl.connectis.programator.model.Route;
import pl.connectis.programator.model.Ticket;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public interface WorkerService {

    Client registerClient(String firstName, String secondName);

    Client updateClientData(Client client, String firstName, String secondName) throws Exception;

    Client sellTicketToClient(Client client, Ticket ticket) throws Exception;

    List<Client> getAllClients();

    Route addNewRoute(BigDecimal price, String start, String destination, Duration tripDuration);


}

package pl.connectis.programator.service;

import pl.connectis.programator.model.Ticket;

import java.util.List;

public interface UserService {

    List<Ticket> getAllMyTickets();
}

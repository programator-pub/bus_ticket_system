package pl.connectis.programator.service.impl;

import pl.connectis.programator.dao.DB;
import pl.connectis.programator.model.Ticket;
import pl.connectis.programator.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<Ticket> getAllMyTickets() {
        return DB.getTicketList();
    }
}

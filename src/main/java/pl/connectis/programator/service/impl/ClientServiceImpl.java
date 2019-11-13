package pl.connectis.programator.service.impl;

import pl.connectis.programator.dao.DB;
import pl.connectis.programator.model.Client;
import pl.connectis.programator.service.ClientService;

public class ClientServiceImpl implements ClientService {

    @Override
    public Client registerClient(String firstName, String secondName) {
        return DB.addClientToList(new Client(firstName, secondName));
    }
}

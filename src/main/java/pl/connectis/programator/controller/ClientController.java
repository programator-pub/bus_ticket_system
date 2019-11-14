package pl.connectis.programator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.connectis.programator.model.Client;
import pl.connectis.programator.model.Ticket;
import pl.connectis.programator.service.impl.ClientServiceImpl;

@RestController
@RequestMapping("/client")
public class ClientController {

    private ClientServiceImpl clientService;

    public ClientController() {
        this.clientService = new ClientServiceImpl();
    }

    @PostMapping("/buy_ticket")
    public ResponseEntity<Client> buyTicket(@RequestParam Client client, @RequestParam Ticket ticket) throws Exception {

            return ResponseEntity.ok(this.clientService.buyTicket(client, ticket));

    }
}

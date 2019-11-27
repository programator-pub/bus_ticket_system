package pl.connectis.programator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.connectis.programator.model.Client;
import pl.connectis.programator.model.Ticket;
import pl.connectis.programator.service.impl.ClientServiceImpl;
import pl.connectis.programator.service.impl.TicketService;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private ClientServiceImpl clientService;
    private TicketService ticketService;

    public ClientController() {
        this.clientService = new ClientServiceImpl();
        this.ticketService = new TicketService();
    }

    @RequestMapping(value = "/buy", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity buyTicket(@RequestBody Client client) throws Exception {
        Client client1 = new Client();
//        System.out.println(this.ticketService.getForeignPrices(client.getTickets().get(0), "eur") + " EUR");
//        System.out.println(this.ticketService.getForeignPrices(client.getTickets().get(0), "gbp") + " GBP");
//        System.out.println(this.ticketService.getForeignPrices(client.getTickets().get(0), "usd") + " USD");
//        return ResponseEntity.ok(this.clientService.buyTicket(client, client.getTickets().get(0)));
        return ResponseEntity.ok(client);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Client>> getAllClients() {
        return ResponseEntity.ok(this.clientService.getAll());
    }
}

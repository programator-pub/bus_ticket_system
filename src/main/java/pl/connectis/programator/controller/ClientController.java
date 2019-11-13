package pl.connectis.programator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.connectis.programator.model.Client;
import pl.connectis.programator.service.impl.ClientServiceImpl;

@RestController
@RequestMapping("/client")
public class ClientController {

    private ClientServiceImpl clientService;

    public ClientController() {
        this.clientService = new ClientServiceImpl();
    }

    @PostMapping("/register")
    public ResponseEntity<Client> registerNewClient(@RequestParam String firstName, @RequestParam String secondName) {
        return ResponseEntity.ok(this.clientService.registerClient(firstName, secondName));
    }



}

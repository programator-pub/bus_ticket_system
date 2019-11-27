package pl.connectis.programator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.connectis.programator.model.Client;
import pl.connectis.programator.model.Ticket;
import pl.connectis.programator.service.impl.UserServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserServiceImpl userService;

    public UserController() {
        this.userService = new UserServiceImpl();
    }

    @GetMapping("/listMyTickets")
    public ResponseEntity<List<Ticket>> getAllMyTickets(@RequestBody Client client) {
        return ResponseEntity.ok(this.userService.getAllMyTickets());
    }

}

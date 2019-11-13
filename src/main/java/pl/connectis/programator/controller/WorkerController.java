package pl.connectis.programator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.connectis.programator.model.Client;
import pl.connectis.programator.service.impl.SupervisiorServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/worker")
public class WorkerController {

    private SupervisiorServiceImpl supervisiorService;

    public WorkerController() {
        this.supervisiorService = new SupervisiorServiceImpl();
    }

    //TODO http://localhost:8080/worker/register?firstName=Andrzej&secondName=Kowalski
    @PostMapping("/register")
    public ResponseEntity<Client> registerNewClient(@RequestParam String firstName, @RequestParam String secondName) {
        return ResponseEntity.ok(this.supervisiorService.registerClient(firstName, secondName));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Client>> getAllClients() {
        return ResponseEntity.ok(this.supervisiorService.getAllClients());
    }
}

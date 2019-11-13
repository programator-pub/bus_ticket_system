package pl.connectis.programator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.connectis.programator.model.Route;
import pl.connectis.programator.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @GetMapping("/route_list")
    public ResponseEntity<List<Route>> getAllRoutesList() {
        return ResponseEntity.ok(this.userService.getAllRoutes());
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}

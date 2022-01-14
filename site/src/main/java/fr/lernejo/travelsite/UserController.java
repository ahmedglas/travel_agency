package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
public record UserController(UserRepository userRep) {

        @PostMapping(value = "/api/inscription", consumes = {
                "application/json"
        })
        public void createUser(@RequestBody @Valid User user) {
                userRep.addUser(user);
        }
}

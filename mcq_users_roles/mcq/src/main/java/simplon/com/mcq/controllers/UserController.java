package simplon.com.mcq.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import simplon.com.mcq.domain.dtos.UserCreate;
import simplon.com.mcq.domain.dtos.UserLogin;
import simplon.com.mcq.services.UserService;

@RestController

public class UserController {
    private final UserService service;

    public UserController(UserService service) {
	this.service = service;
    }

    @PostMapping("/users")
    public void testCreateUser(@Valid @RequestBody UserCreate inputs) {
	service.create(inputs);
    }

    @PostMapping("/login")
    public void login(@Valid @RequestBody UserLogin inputs) {
	service.login(inputs);
    }

    @GetMapping("/testCnx")
    public String testCnx() {
	return "Connexion est reussie!";
    }

}

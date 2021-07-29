package com.viguime.Template.API.REST;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping
    public String getUsers() {
        return "HTTP GET request was sent";
    }

    @PostMapping
    public String createUsers() {
        return "HTTP POST request was sent";
    }

    @DeleteMapping
    public String deleteUsers() {
        return "HTTP Delete request was sent";
    }

    @PutMapping
    public String putUsers() {
        return "HTTP Delete request was sent";
    }
}

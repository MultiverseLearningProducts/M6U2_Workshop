package com.jse.module06.lab02.controller;

import com.jse.module06.lab02.model.User;
import com.jse.module06.lab02.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for User CRUD.
 * Complete each endpoint to use the service and return the appropriate status codes.
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        // TODO: Return 200 OK with list of all users
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getOne(@PathVariable Long id) {
        // TODO: Return 200 OK with user if found; consider 404 if not found
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        // TODO: Save user and return 201 Created with the saved user (including generated id)
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        // TODO: Delete user; return 204 No Content on success
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
}

package com.revature.controllers;

import com.revature.beans.User;
import com.revature.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@RestController
@RequestMapping(path="/users")
public class UserController {

    // not code or implementation for this
    // all methods come from the JpaRepository<T, ID>
    private UserRepo userRepo;

    @Autowired
    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path="/{id}")
    public User getById(@PathVariable("id") int id) {return userRepo.getById(id);}

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path="/user/{username}")
    public User getByUsername(@PathVariable("username") String username) {
      System.out.println("Welcome from getByUsername, username = " + username);
      return userRepo.getByUsername(username);}

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(consumes = "application/json", produces = "application/json")
    public User addUser(@RequestBody User user) {
      System.out.println(user);
      return userRepo.save(user);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping(path="/{id}")
    public void updateUser(@PathVariable("id") int id, @RequestBody User user) {
        if ( id == user.getUserId()) {
            userRepo.save(user);
        }
    }

   @CrossOrigin(origins = "http://localhost:4200")
   @DeleteMapping(path="/{id}")
   public void deleteUser(@PathVariable("id") int id) {
            userRepo.delete(userRepo.getById(id));
        }
}

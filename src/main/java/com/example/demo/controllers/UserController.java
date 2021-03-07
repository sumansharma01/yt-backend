package com.example.demo.controllers;

import com.example.demo.models.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/youtube/api/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserModel> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public Optional<UserModel> getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @PostMapping("/users")
    public String postUser(@RequestBody UserModel user){
        String message=userService.postUser(user);
        return message;
    }

    @PutMapping("/users/{id}")
    public String putUser(@RequestBody UserModel user, @PathVariable int id){
        String message=userService.putUser(id,user);
        return message;
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id){
        String message=userService.deleteUser(id);
        return message;
    }
}

package com.example.demo.service;

import com.example.demo.models.UserModel;
import com.example.demo.repository.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<UserModel> getAllUsers(){
        return userRepo.findAll();
    }

    public Optional<UserModel> getUserById(int id){
        return userRepo.findById(id);
    }

    public String postUser(UserModel user){
        userRepo.save(user);
        return user.getChannelName()+" saved to database";
    }

    public String putUser(int id,UserModel user){
        userRepo.save(user);
        return " updated successfully";
    }

    public String deleteUser(int id){
        Optional<UserModel> user=getUserById(id);
        String name=user.get().getChannelName();
        userRepo.deleteById(id);

        return name+ " channel deleted sucessfully";
    }

}

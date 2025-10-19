package com.example.demo.userManagment.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.userManagment.service.UserService;
import java.util.*;
import com.example.demo.userManagment.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("users")
public class userController {
    @Autowired
    private UserService userService;
     @PostMapping
     public User addUser(@RequestBody User user){
        return userService.addUser(user);
     }
    //create controller
    @GetMapping
    public List<User> getAUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
       return userService.getUserById(id);
    }
    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user){

     return userService.UpdateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }
    


    
}

package com.example.library.repository;
import com.example.demo.userManagment.model.User;
import java.util.*;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private List<User> users=new ArrayList<>();
    public User save(User user){
        users.add(user);
        return user;
    }


 public User findByEmail(String email){
    for(User u:users){
        if(u.getEamil().equals(email))return u;
    }
    return null;
 } 
 
 public List<User> findAll(){
    return users;
 }
}

package com.example.demo.userManagment.repository;
import java.util.*;
import org.springframework.stereotype.Repository;
import com.example.demo.userManagment.model.User;
@Repository
public class userRepository {
private  List<User>users=new ArrayList<>();
//    create
public User saveUser(User user){
    users.add(user);
    return user;
}
//Reading all
public List<User> findAllUsers(){
    return users;
}
//Read one user
public User findById(int id){
    for(User user:users){
        if(user.getID()==id){
            return user;
        }
    }
        return null;
    }
//update user 
 public User updatUser(int id, User user){
    for(User u:users){
        if(u.getID()==id){
            u.setName(user.getName());
            u.setEmail(user.getEamil());
            u.setPassword(user.getPassword());
            return u; 
        }
    }
    return null;
 }

public boolean DeleteById(int id){
    User found=null;
    for(User u:users){
        if(u.getID()==id){
            found=u;
            break;

        }
    }
    if(found !=null){
        users.remove(found);
        return true;
    }
    return false;
}



}
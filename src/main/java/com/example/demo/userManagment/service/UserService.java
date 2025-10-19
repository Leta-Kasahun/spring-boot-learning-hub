package com.example.demo.userManagment.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.userManagment.model.User;
import com.example.demo.userManagment.repository.userRepository;
import java.util.*;

@Service
public class UserService {
    @Autowired
    private userRepository UserRepo;
    //create user
    public User addUser(User user){
        return UserRepo.saveUser(user);  
    }
    //read user
    public List<User> getAllUsers(){
        return UserRepo.findAllUsers();
    }
     //finding one user
    public User getUserById(int id){
        return UserRepo.findById(id);
    }
//update user
public User UpdateUser(int id, User user){
    return UserRepo.updatUser(id, user);

}

//delete user
public String deleteUser(int id){
    boolean deleted=UserRepo.DeleteById(id);
    return deleted? "User is deleted successfully":"user is not found";
}  
}

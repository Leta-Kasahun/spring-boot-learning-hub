package com.example.JDBC.umgmt.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.JDBC.umgmt.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long>{}


  

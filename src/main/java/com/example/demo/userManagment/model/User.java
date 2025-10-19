package com.example.demo.userManagment.model;

public class User {
  private String name;
  private String email;
  private String password;
  private int id;

  public User(){}
  public User(String name,String email, String password,int id){
    this.name=name;
    this.email=email;
    this.password=password;
    this.id=id;
  }
// setter
public int setID(int id){return this.id=id; }
public String setName(String name){return this.name=name;}
public String setEmail(String email){return this.email=email;}
public String setPassword(String password){return this.password;}
//getter
public int getID() {return this.id;}
public String getName(){return this.name;}
public String getEamil(){return this.email;}
public String getPassword(){return this.password;}
}

package com.smartkantin.dto.login;

public class Data {
    private String username;
    private String password;
    private String status;
    
    public String getUsername(){
        return this.username;
    }
    public String getStatus(){
        return this.status;
    }
    public String getPassword(){
        return this.password;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
}

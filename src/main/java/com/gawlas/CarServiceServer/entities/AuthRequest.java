package com.gawlas.CarServiceServer.entities;

/**
 *   Basic class to store credencial data
 *   @author S.Gawlas
 *   @version 1.0.0
 **/
public class AuthRequest {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

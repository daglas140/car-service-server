package com.gawlas.CarServiceServer.dao.apiModel;

import java.util.Date;

public class User {
    private Integer id;
    private String userName;
    private String password;
    private String email;
    private String persId;
    private Date createdDate;

    public User() {
    }

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public User(Integer id, String userName, String email, String persId, Date createdDate) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.persId = persId;
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersId() {
        return persId;
    }

    public void setPersId(String persId) {
        this.persId = persId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

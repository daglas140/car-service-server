package com.gawlas.CarServiceServer.entities;

import com.gawlas.CarServiceServer.entities.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "auth_pass")
public class AuthPass extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "password")
    private String password;

    @OneToOne(mappedBy = "authPass")
    private User user;

    public AuthPass() {
    }

    public AuthPass(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

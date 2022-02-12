package com.gawlas.CarServiceServer.entities;

import com.gawlas.CarServiceServer.entities.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "pers_id")
    private Long persId;
    @Column(name = "user_id")
    private Long userId;

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersId() {
        return persId;
    }

    public void setPersId(Long persId) {
        this.persId = persId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}

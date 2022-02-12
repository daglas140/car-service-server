package com.gawlas.CarServiceServer.entities;

import com.gawlas.CarServiceServer.entities.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "service_history")
public class ServiceHistory extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "date")
    private Date date;
    @Column(name = "current_mileage")
    private Integer currentMileage;
    @Column(name = "mileage_from_last_service")
    private Integer mileageFromLastService;

    public ServiceHistory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCurrentMileage() {
        return currentMileage;
    }

    public void setCurrentMileage(Integer currentMileage) {
        this.currentMileage = currentMileage;
    }

    public Integer getMileageFromLastService() {
        return mileageFromLastService;
    }

    public void setMileageFromLastService(Integer mileageFromLastService) {
        this.mileageFromLastService = mileageFromLastService;
    }
}

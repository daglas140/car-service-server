package com.gawlas.CarServiceServer.entities;

import com.gawlas.CarServiceServer.entities.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "inspection")
@Entity
public class Inspection extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "date")
    private Date date;
    @Column(name = "inspection_text", length = 50000)
    private String inspectionText;
    @Column(name = "current_mileage")
    private Integer currentMileage;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "car_id", referencedColumnName="id", nullable = false)
    private Cars cars;

    public Inspection() {
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

    public String getInspectionText() {
        return inspectionText;
    }

    public void setInspectionText(String inspectionText) {
        this.inspectionText = inspectionText;
    }

    public Integer getCurrentMileage() {
        return currentMileage;
    }

    public void setCurrentMileage(Integer currentMileage) {
        this.currentMileage = currentMileage;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }
}

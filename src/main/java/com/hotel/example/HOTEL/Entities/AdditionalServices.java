package com.hotel.example.HOTEL.Entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AdditionalServices {

    @Id
    @GeneratedValue
    private Long id;

    private BigDecimal swimmingpool;
    private BigDecimal SPA;
    private BigDecimal gym;

    @ManyToOne
    private Resevation resevation;


    @ManyToOne
    private Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }


    public Resevation getResevation() {
        return resevation;
    }

    public void setResevation(Resevation resevation) {
        this.resevation = resevation;
    }


    public AdditionalServices(){}

    public AdditionalServices(BigDecimal swimmingpool, BigDecimal SPA, BigDecimal gym) {
        this.swimmingpool = swimmingpool;
        this.SPA = SPA;
        this.gym = gym;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getSwimmingpool() {
        return swimmingpool;
    }

    public void setSwimmingpool(BigDecimal swimmingpool) {
        this.swimmingpool = swimmingpool;
    }

    public BigDecimal getSPA() {
        return SPA;
    }

    public void setSPA(BigDecimal SPA) {
        this.SPA = SPA;
    }

    public BigDecimal getGym() {
        return gym;
    }

    public void setGym(BigDecimal gym) {
        this.gym = gym;
    }

    @Override
    public String toString() {
        return "AdditionalServices{" +
                "id=" + id +
                ", swimmingpool=" + swimmingpool +
                ", SPA=" + SPA +
                ", gym=" + gym +
                '}';
    }
}

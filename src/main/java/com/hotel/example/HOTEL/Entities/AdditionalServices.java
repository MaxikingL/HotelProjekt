package com.hotel.example.HOTEL.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class AdditionalServices {

    @Id
    @GeneratedValue
    private Long id;

    private BigDecimal swimmingpool;
    private BigDecimal SPA;
    private BigDecimal gym;

    public AdditionalServices(BigDecimal swimmingpool, BigDecimal SPA, BigDecimal gym) {
        this.swimmingpool = swimmingpool;
        this.SPA = SPA;
        this.gym = gym;
    }

    public void setId(Long id) {
        this.id = id;
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

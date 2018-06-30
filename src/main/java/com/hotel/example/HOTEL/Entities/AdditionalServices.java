package com.hotel.example.HOTEL.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

    @OneToMany(mappedBy = "reservation")
    private List<Resevation> adds = new ArrayList<>();

    public List<Resevation> getAdds() {
        return adds;
    }

    public void setAdds(List<Resevation> adds) {
        this.adds = adds;
    }

    protected AdditionalServices(){}

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

package com.hotel.example.HOTEL.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Payment {

    @Id
    @GeneratedValue
    private Long id;

    private boolean statusPayment;

    @OneToOne(mappedBy = "reservation")
    private Resevation resevation;

    public Resevation getResevation() {
        return resevation;
    }

    public void setResevation(Resevation resevation) {
        this.resevation = resevation;
    }

    protected Payment() {}

    public Payment(boolean statusPayment) {
        this.statusPayment = statusPayment;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isStatusPayment() {
        return statusPayment;
    }

    public void setStatusPayment(boolean statusPayment) {
        this.statusPayment = statusPayment;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", statusPayment=" + statusPayment +
                '}';
    }
}

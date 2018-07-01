package com.hotel.example.HOTEL.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Payment {

    @Id
    @GeneratedValue
    private Long id;

    private boolean statusPayment;

    @OneToOne(mappedBy = "payment")
    private Resevation resevation;

    @OneToOne
    private Client client;

    @OneToMany
    private List<AdditionalServices> additionalServices = new ArrayList();

    public List<AdditionalServices> getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(List<AdditionalServices> additionalServices) {
        this.additionalServices = additionalServices;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

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

    public Long getId() {
        return id;
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

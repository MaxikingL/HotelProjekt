package com.hotel.example.HOTEL.Entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String surname;

    @OneToOne
    private Resevation resevation;

    @OneToOne(mappedBy = "client")
    private Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Resevation getResevation() {
        return resevation;
    }

    public void setResevation(Resevation resevation) {
        this.resevation = resevation;
    }


    @OneToMany(mappedBy = "client")
    private List<Resevation> cl = new ArrayList<>();

    public List<Resevation> getCl() {
        return cl;
    }

    public void setCl(List<Resevation> cl) {
        this.cl = cl;
    }

    protected   Client(){


    }

    public Client(String name, String surname, Resevation resevation, Payment payment, List<Resevation> cl) {
        this.name = name;
        this.surname = surname;
        this.resevation = resevation;
        this.payment = payment;
        this.cl = cl;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", resevation=" + resevation +
                ", payment=" + payment +
                ", cl=" + cl +
                '}';
    }
}

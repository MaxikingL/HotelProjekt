package com.hotel.example.HOTEL.Entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String surname;

    @OneToOne
    private Login login;

    @OneToOne(mappedBy = "client")
    private Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
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
    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
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
                ", login=" + login +
                ", payment=" + payment +
                ", cl=" + cl +
                '}';
    }
}

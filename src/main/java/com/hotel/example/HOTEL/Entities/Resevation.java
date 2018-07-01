package com.hotel.example.HOTEL.Entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Resevation {

    @Id
    @GeneratedValue
    private Long id;

    private String nameHotel;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;

    @OneToOne
    private Payment payment;

    @ManyToMany
    private List<Room> room = new ArrayList<>();

    @OneToMany
    private List<AdditionalServices> as = new ArrayList<>();


    public List<Room> getRomm() {
        return room;
    }

    public void setRom(List<Room> room) {
        this.room = room;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    protected Resevation(){}

    public Resevation(String nameHotel, Date startTime, Date endTime) {
        this.nameHotel = nameHotel;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Resevation{" +
                "id=" + id +
                ", nameHotel='" + nameHotel + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}

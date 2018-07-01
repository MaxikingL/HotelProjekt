package com.hotel.example.HOTEL.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Menu {

    @Id
    @GeneratedValue
    private Long id;


    private String meal;
    private int price;

    @ManyToMany
    private List<Workers> workersList = new ArrayList<>();

    public List<Workers> getWorkersList() {
        return workersList;
    }

    public void setWorkersList(List<Workers> workersList) {
        this.workersList = workersList;
    }

    private Menu(){


    }
    public Menu(int price, String meal) {
        this.meal = meal;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", meal='" + meal + '\'' +
                ", price=" + price +
                ", workersList=" + workersList +
                '}';
    }
}

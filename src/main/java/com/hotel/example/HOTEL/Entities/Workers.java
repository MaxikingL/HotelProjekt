package com.hotel.example.HOTEL.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Workers {


    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String surname;


    @ManyToMany(mappedBy = "workersList")
    private List<Menu> menuList = new ArrayList<>();

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    private Workers(){

    }

    public Workers(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
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
}
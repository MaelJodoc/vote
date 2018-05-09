package com.shinkarev.vote.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Смена on 07.05.2018.
 */
@Entity
public class Dish extends BaseModel {
    @Column
    private String name;

    @Column
    private long cost; //cost in kopeikah

    public Dish(String name, long cost) {
        this.name = name;
        this.cost = cost;
    }

    public Dish() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", id=" + id +
                '}';
    }
}

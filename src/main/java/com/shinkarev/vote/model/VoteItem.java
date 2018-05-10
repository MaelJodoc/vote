package com.shinkarev.vote.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Смена on 07.05.2018.
 */
@Entity
public class VoteItem extends AbstractPersistable<Long> {
    @Column
    private String restaurantName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "vote_item_id")
    @Fetch(FetchMode.SUBSELECT)
    private List<Dish> dishes;

    public VoteItem(String restaurantName, List<Dish> dishes) {
        this.restaurantName = restaurantName;
        this.dishes = dishes;
    }

    public VoteItem() {
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return "VoteItem{" +
                "restaurantName='" + restaurantName + '\'' +
                ", dishes=" + dishes +
                ", id=" + getId() +
                '}';
    }
}

package com.shinkarev.vote.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Смена on 07.05.2018.
 */
@Entity
public class VoteItem extends BaseModel {
    @Column
    private String restaurantName;

    @OneToMany
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
}

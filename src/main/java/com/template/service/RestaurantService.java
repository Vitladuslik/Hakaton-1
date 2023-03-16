package com.template.service;

import com.template.entities.Restaurant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RestaurantService {
    void addRestaurant();
    void update();
    void getAll();
    Page<Restaurant> getByCity();
    Restaurant getById();
    void delete();
    void sort();

}

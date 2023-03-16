package com.template.service;

import com.template.dto.RestaurantDto;
import com.template.entities.Restaurant;
import org.springframework.data.domain.Page;

import java.util.List;

public interface RestaurantService {
    void addRestaurant();
    void update();
    List<RestaurantDto> getAllRestaurants();
    Page<Restaurant> getByCity();
    Restaurant getById();
    void delete();
    void sort();

}

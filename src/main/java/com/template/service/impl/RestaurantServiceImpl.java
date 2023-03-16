package com.template.service.impl;

import com.template.dto.RestaurantDto;
import com.template.entities.Restaurant;
import com.template.repository.RestaurantRepository;
import com.template.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;
    @Override
    public void addRestaurant() {

    }

    @Override
    public void update() {

    }

    @Override
    public List<RestaurantDto> getAllRestaurants() {
        return restaurantRepository.findAll().stream().map(RestaurantDto::fromEntity).toList();
    }

    @Override
    public Page<Restaurant> getByCity() {
        return null;
    }

    @Override
    public Restaurant getById() {
        return null;
    }

    @Override
    public void delete() {

    }

    @Override
    public void sort() {

    }
}

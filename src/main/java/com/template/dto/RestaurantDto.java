package com.template.dto;

import com.template.entities.Restaurant;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RestaurantDto {
    private Long id;
    private String city;
    private String name;
    private Integer estimatedCost;
    private String averageRating;
    private Integer votes;

    public static RestaurantDto fromEntity(Restaurant restaurant) {
        return RestaurantDto.builder()
                .id(restaurant.getId())
                .city(restaurant.getCity())
                .name(restaurant.getName())
                .estimatedCost(restaurant.getEstimatedCost())
                .averageRating(restaurant.getAverageRating())
                .votes(restaurant.getVotes())
                .build();
    }

}
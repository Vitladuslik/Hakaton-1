package com.template.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RestaurantDTO {
    private Long id;
    private String city;
    private String name;
    private Integer estimatedCost;
    private String averageRating;
    private Integer votes;

}
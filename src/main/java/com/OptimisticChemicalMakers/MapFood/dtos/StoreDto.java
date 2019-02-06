package com.OptimisticChemicalMakers.MapFood.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;

public class StoreDto {

    private Long id;

    private Double latitude;

    private Double longitude;

    private String name;

    private String dishDescription;

    private String city;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double requestorDistance;

    public StoreDto() {

    }

    // Getters

    public Long getId() {
        return id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    public String getDishDescription() {
        return dishDescription;
    }

    public String getCity() {
        return city;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRequestorDistance(Double distance) { this.requestorDistance = distance; }

}

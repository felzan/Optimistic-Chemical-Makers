package com.OptimisticChemicalMakers.MapFood.dtos;

import java.util.Set;

public class DeliveryOrderDto {

    private Long id;

    private Long storeId;

    private Double latitude;

    private Double longitude;

    private Set<DeliveryItemDto> deliveryItems;

    // Constructor

    public DeliveryOrderDto() {
    }

    // Getters

    public Long getId() {
        return this.id;
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public Set<DeliveryItemDto> getDeliveryItems() {
        return this.deliveryItems;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setStoreId(Long store_id) {
        this.storeId = store_id;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setDeliveryItems(Set<DeliveryItemDto> deliveryItems) {
        this.deliveryItems = deliveryItems;
    }


}
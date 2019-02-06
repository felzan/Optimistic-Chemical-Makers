package com.OptimisticChemicalMakers.MapFood.dtos;

import com.OptimisticChemicalMakers.MapFood.models.Product;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

public class DeliveryItemDto {

    // Class Properties

    private Long id;

    private Long productId;

    private Long deliveryOrderId;

    private Integer quantity;

    // Constructor

    public DeliveryItemDto() {
    }

    // Getters

    public Long getId() {
        return this.id;
    }

    public Long getProductId() {
        return this.productId;
    }

    public Long getDeliveryOrderId() {
        return this.deliveryOrderId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setDeliveryOrderId(Long deliveryOrderId) {
        this.deliveryOrderId = deliveryOrderId;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}

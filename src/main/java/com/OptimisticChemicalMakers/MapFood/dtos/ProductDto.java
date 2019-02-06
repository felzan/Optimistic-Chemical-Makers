package com.OptimisticChemicalMakers.MapFood.dtos;

import java.math.BigDecimal;

public class ProductDto {

    // Properties

    private Long id;

    private String description;

    private BigDecimal price;
    
    private String restaurant;
    
    private String classification;

    // Constructor

    public ProductDto() {
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
    
    public String getClassification() {
		return classification;
	}
    
    // Getters

	public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

	public void setClassification(String classification) {
		this.classification = classification;
	}

	
	public String getRestaurant() {
		return restaurant;
	}

}

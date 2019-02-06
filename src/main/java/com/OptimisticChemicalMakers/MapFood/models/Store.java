package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Store extends Geolocation {

    // Properties

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String dishDescription;

    private String city;

    @OneToMany(mappedBy="store", cascade = CascadeType.ALL)
    private Set<Product> products;

    @OneToMany(mappedBy="store", cascade = CascadeType.ALL)
    private Set<DeliveryOrder> deliveryOrders;

    // Constructors

    public Store() {
    }

    public Store(Long latitude, Long longitude, String name, String dishDescription) {
        super(latitude, longitude);
        this.name = name;
        this.dishDescription = dishDescription;
    }

    // Get Methods

    public Long getId() {
        return id;
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

    public Set<Product> getAvailableProducts() {
        return this.products;
    }

    public Set<DeliveryOrder> getDeliveryOrders() {
        return this.deliveryOrders;
    }

    // Set Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Methods

    public void addDeliveryOrder(DeliveryOrder deliveryOrder) {
        this.deliveryOrders.add(deliveryOrder);
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

}

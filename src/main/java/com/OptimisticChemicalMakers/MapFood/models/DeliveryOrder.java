package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class DeliveryOrder extends Geolocation {

    // Class Properties

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="store_id", nullable=false)
    private Store store;

    @OneToMany(mappedBy="deliveryOrder", cascade = CascadeType.ALL)
    private Set<DeliveryItem> deliveryItems;

    // Constructors

    public DeliveryOrder(){

    }

    // Getters

    public Long getId() {
        return this.id;
    }

    public Store getStore() {
        return this.store;
    }

    public Set<DeliveryItem> getDeliveryItems() {
        return this.deliveryItems;
    }

    // Setters

    public void setStore(Store store) {
        this.store = store;
    }

    public void setDeliveryItems(Set<DeliveryItem> deliveryItems) {
        this.deliveryItems = deliveryItems;
    }

}
package com.OptimisticChemicalMakers.MapFood.controllers;

import com.OptimisticChemicalMakers.MapFood.Services.DeliveryOrderService;
import com.OptimisticChemicalMakers.MapFood.dtos.DeliveryOrderDto;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:4200") // Temporary for the Angular App test
@RestController
@RequestMapping(value = "/order")
public class DeliveryOrderController {

    @Autowired
    private DeliveryOrderService deliveryOrderService;

    // POST /create
    // Create Delivery Order
    @PostMapping(value = "/create")
    public ResponseEntity<?> createOrder(@RequestBody DeliveryOrderDto deliveryOrderDto) {
        return ResponseEntity.ok(deliveryOrderService.createDeliveryOrder(deliveryOrderDto));
    }

}




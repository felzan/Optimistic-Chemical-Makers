package com.OptimisticChemicalMakers.MapFood.factories;

import com.OptimisticChemicalMakers.MapFood.dtos.DeliveryItemDto;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryItem;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryOrder;
import com.OptimisticChemicalMakers.MapFood.models.Product;
import com.OptimisticChemicalMakers.MapFood.repositories.DeliveryOrderRepository;
import com.OptimisticChemicalMakers.MapFood.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeliveryItemFactory {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    DeliveryOrderRepository deliveryOrderRepository;


    public DeliveryItem getInstance(DeliveryItemDto deliveryItemDto) {

        DeliveryItem deliveryItem = new DeliveryItem();

        deliveryItem.setQuantity(deliveryItemDto.getQuantity());

        deliveryItem.setProduct(productRepository.findById(deliveryItemDto.getProductId()).orElseThrow(RuntimeException::new));

        // Order
//        DeliveryOrder deliveryOrder = deliveryOrderRepository.findById(deliveryItemDto.getDeliveryOrderId()).orElseThrow(RuntimeException::new);
//        deliveryItem.setDeliveryOrder(deliveryOrder);

        // Return
        return deliveryItem;

    }

    public DeliveryItemDto getInstance(DeliveryItem deliveryItem) {

        DeliveryItemDto deliveryItemDto = new DeliveryItemDto();

        deliveryItemDto.setId(deliveryItem.getId());

        deliveryItemDto.setQuantity(deliveryItem.getQuantity());

        deliveryItemDto.setProductId(deliveryItem.getProduct().getId());

        deliveryItemDto.setDeliveryOrderId(deliveryItem.getProduct().getId());

        return deliveryItemDto;

    }


}

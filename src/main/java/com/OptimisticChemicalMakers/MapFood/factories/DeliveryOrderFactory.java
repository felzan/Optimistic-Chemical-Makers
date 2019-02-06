package com.OptimisticChemicalMakers.MapFood.factories;

import com.OptimisticChemicalMakers.MapFood.dtos.DeliveryItemDto;
import com.OptimisticChemicalMakers.MapFood.dtos.DeliveryOrderDto;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryItem;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class DeliveryOrderFactory {

    @Autowired
    DeliveryItemFactory deliveryItemFactory;

    public DeliveryOrder getInstance(DeliveryOrderDto deliveryOrderDto) {

        DeliveryOrder deliveryOrder = new DeliveryOrder();

        deliveryOrder.setGeolocation(deliveryOrderDto.getLatitude(), deliveryOrderDto.getLongitude());

        Set<DeliveryItem> deliveryItems = StreamSupport.stream(deliveryOrderDto.getDeliveryItems().spliterator(), false)
                .map(deliveryItemFactory::getInstance)
                .collect(Collectors.toSet());

        deliveryItems.forEach(deliveryItem -> deliveryItem.setDeliveryOrder(deliveryOrder));

        deliveryOrder.setDeliveryItems(deliveryItems);

        return deliveryOrder;

    }

    public DeliveryOrderDto getInstance(DeliveryOrder deliveryOrder) {

        DeliveryOrderDto deliveryOrderDto = new DeliveryOrderDto();

        deliveryOrderDto.setId(deliveryOrder.getId());

        deliveryOrderDto.setStoreId(deliveryOrder.getStore().getId());

        deliveryOrderDto.setLatitude(deliveryOrder.getLatitude());

        deliveryOrderDto.setLongitude(deliveryOrder.getLongitude());

        Set<DeliveryItemDto> deliveryItems = StreamSupport.stream(deliveryOrder.getDeliveryItems().spliterator(), false)
                .map(deliveryItemFactory::getInstance)
                .collect(Collectors.toSet());

        deliveryOrderDto.setDeliveryItems(deliveryItems);

        return deliveryOrderDto;

    }

}
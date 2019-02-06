package com.OptimisticChemicalMakers.MapFood.factories;

import com.OptimisticChemicalMakers.MapFood.dtos.StoreDto;
import com.OptimisticChemicalMakers.MapFood.models.Store;
import org.springframework.stereotype.Component;

@Component
public class StoreFactory {

    public StoreDto getInstance(Store store) {
        StoreDto storeDto = new StoreDto();
        storeDto.setLatitude(store.getLatitude());
        storeDto.setLongitude(store.getLongitude());
        storeDto.setName(store.getName());
        storeDto.setDishDescription(store.getDishDescription());
        storeDto.setCity(store.getCity());
        storeDto.setId(store.getId());
        return storeDto;
    }

    public StoreDto getInstance(Store store, Double distance) {
        StoreDto storeDto = this.getInstance(store);
        storeDto.setRequestorDistance(distance);
        return storeDto;
    }

    public Store getInstance(StoreDto storeDto) {
        Store store = new Store();
        store.setGeolocation(storeDto.getLatitude(), storeDto.getLongitude());
        store.setName(storeDto.getName());
        store.setCity(storeDto.getCity());
        store.setDishDescription(storeDto.getDishDescription());
        return store;
    }

}

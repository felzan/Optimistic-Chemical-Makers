package com.OptimisticChemicalMakers.MapFood.Services;

import com.OptimisticChemicalMakers.MapFood.dtos.DeliveryOrderDto;
import com.OptimisticChemicalMakers.MapFood.dtos.ProductDto;
import com.OptimisticChemicalMakers.MapFood.dtos.StoreDto;
import com.OptimisticChemicalMakers.MapFood.factories.DeliveryOrderFactory;
import com.OptimisticChemicalMakers.MapFood.factories.ProductFactory;
import com.OptimisticChemicalMakers.MapFood.factories.StoreFactory;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryOrder;
import com.OptimisticChemicalMakers.MapFood.models.Product;
import com.OptimisticChemicalMakers.MapFood.models.Store;
import com.OptimisticChemicalMakers.MapFood.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class StoreService {

    // Repositories

    @Autowired
    private StoreRepository storeRepository;

    // Factories

    @Autowired
    private ProductFactory productFactory;

    @Autowired
    private StoreFactory storeFactory;

    @Autowired
    private DeliveryOrderFactory deliveryOrderFactory;

    // Methods - Store

    public List<StoreDto> getStores() {
        return StreamSupport.stream(storeRepository.findAll().spliterator(), false)
                .map(storeFactory::getInstance)
                .collect(Collectors.toList());
    }

    public List<Store> getNearestStores( Long latitude, Long longitude, Long radius) {
        return storeRepository.getNearestStores(latitude, longitude, 5L);
    }

    public StoreDto getStore(Long id) {
        return storeFactory.getInstance(storeRepository.findById(id).orElseThrow(RuntimeException::new));
    }

    public StoreDto createStore(StoreDto storeDto) {
        Store store = storeRepository.save(storeFactory.getInstance(storeDto));
        return storeFactory.getInstance(store);
    }

    public ResponseEntity<?> deleteStoreById(Long id) {
        try {
            storeRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (Exception ex) {
            return ResponseEntity.notFound().build();
        }
    }

    // Methods - Store/Products

    public List<ProductDto> getProducts(Long id) {
        Store store = storeRepository.findById(id).orElseThrow(RuntimeException::new);
        return StreamSupport.stream(store.getAvailableProducts().spliterator(), false)
                .map(productFactory::getInstance)
                .collect(Collectors.toList());
    }

    public ProductDto createProduct(Long id, ProductDto productDto) {
        Store store = storeRepository.findById(id).orElseThrow(RuntimeException::new);
        Product product = productFactory.getInstance(productDto);
        store.addProduct(product);
        storeRepository.save(store);
        return productFactory.getInstance(product);
    }

    // Methods - Store/DeliveryOrders

    public List<DeliveryOrderDto> getDeliveryOrders(Long id) {
        Store store = storeRepository.findById(id).orElseThrow(RuntimeException::new);
        return StreamSupport.stream(store.getDeliveryOrders().spliterator(), false)
                .map(deliveryOrderFactory::getInstance)
                .collect(Collectors.toList());
    }

    public DeliveryOrderDto createDeliveryOrder (Long id, DeliveryOrderDto deliveryOrderDto) {

        // TO DO : Verificar se os produtos solicitados pertencem ao restaurante;

        Store store = storeRepository.findById(id).orElseThrow(RuntimeException::new);
        DeliveryOrder deliveryOrder = deliveryOrderFactory.getInstance(deliveryOrderDto);
        deliveryOrder.setStore(store);
        store.addDeliveryOrder(deliveryOrder);
        storeRepository.save(store);
        return deliveryOrderFactory.getInstance(deliveryOrder);

    }


}
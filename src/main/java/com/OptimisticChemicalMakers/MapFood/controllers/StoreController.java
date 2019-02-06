package com.OptimisticChemicalMakers.MapFood.controllers;

import com.OptimisticChemicalMakers.MapFood.Services.StoreService;
import com.OptimisticChemicalMakers.MapFood.dtos.DeliveryOrderDto;
import com.OptimisticChemicalMakers.MapFood.dtos.ProductDto;
import com.OptimisticChemicalMakers.MapFood.dtos.StoreDto;
import com.OptimisticChemicalMakers.MapFood.factories.DeliveryOrderFactory;
import com.OptimisticChemicalMakers.MapFood.factories.ProductFactory;
import com.OptimisticChemicalMakers.MapFood.factories.StoreFactory;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryOrder;
import com.OptimisticChemicalMakers.MapFood.models.Store;
import com.OptimisticChemicalMakers.MapFood.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping(value = "/api")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @Autowired
    private StoreFactory storeFactory;

    // GET /api/stores
    // Get All Stores
    @GetMapping("/stores")
    public List<StoreDto> getAllStores() {
        return storeService.getStores();
    }

    // GET /api/stores/latitude/longitude
    // Get All Closer Stores
    @GetMapping(value = "/stores/nearest")
    public List<StoreDto> getNearestStores(@RequestParam("latitude") Long latitude, @RequestParam("longitude") Long longitude, @RequestParam("longitude") Long radius) {
        return storeService.getNearestStores(latitude,longitude,radius).stream().map(store -> storeFactory.getInstance(store, store.distanceTo(latitude, longitude))).collect(Collectors.toList());
    }

    // GET /api/store/id
    // Get a Single store
    @GetMapping("/store/{id}")
    public StoreDto getStoreById(@PathVariable(value = "id") Long id) {
        return storeService.getStore(id);
    }

    // DELETE /api/store/id
    // Delete a single store
    @DeleteMapping("/store/{id}")
    public ResponseEntity<?> deleteStoreById(@PathVariable(value = "id") Long id) {
        return storeService.deleteStoreById(id);
    }

    // POST /api/stores
    // Create a new Store
    @PostMapping("/stores")
    public StoreDto createStore(@RequestBody StoreDto storeDto) {
        return storeService.createStore(storeDto);
    }

    // GET /api/store/id/products
    // Get products by store id
    @GetMapping(value = "/store/{id}/products")
    public List<ProductDto> getProducts(@PathVariable(value="id") Long id) {
        return storeService.getProducts(id);
    }

    // POST /api/store/id/products
    // Create products by store id
    @PostMapping(value = "/store/{id}/products")
    public ProductDto createProduct( @PathVariable(value="id") Long id, @RequestBody ProductDto productDto) {
      return storeService.createProduct(id, productDto);
    }

    // GET /api/store/id/orders
    // Get delivery orders by store id
    @GetMapping(value="/store/{id}/orders")
    public List<DeliveryOrderDto> getDeliveryOrders(@PathVariable(value="id") Long id) {
        return storeService.getDeliveryOrders(id);
    }

    // POST api/store/id/orders
    // Create a delivery order by store if
    @PostMapping(value="/store/{id}/orders")
    public DeliveryOrderDto createDeliveryOrder(@PathVariable(value="id") Long id, @RequestBody DeliveryOrderDto deliveryOrderDto) {
        return storeService.createDeliveryOrder(id, deliveryOrderDto);
    }

}
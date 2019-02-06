package com.OptimisticChemicalMakers.MapFood.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.OptimisticChemicalMakers.MapFood.dtos.ProductDto;
import com.OptimisticChemicalMakers.MapFood.dtos.StoreDto;
import com.OptimisticChemicalMakers.MapFood.factories.ProductFactory;
import com.OptimisticChemicalMakers.MapFood.models.Product;
import com.OptimisticChemicalMakers.MapFood.models.Store;
import com.OptimisticChemicalMakers.MapFood.repositories.ProductRepository;

@CrossOrigin(origins="http://localhost:4200") // Temporary for the Angular App test
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Factories

    @Autowired
    private ProductFactory productFactory;
    
    @Autowired
    private StoreService storeService;
    
    public List<ProductDto> getByRestaurantId(String restaurantId) {
    	Store store = storeService.getStore(restaurantId);
    	return store
    		.getProducts()
			.stream()
			.map(productFactory::getInstance)
			.collect(Collectors.toList());
	}
    
}

package com.OptimisticChemicalMakers.MapFood.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.expression.Lists;

import com.OptimisticChemicalMakers.MapFood.Services.ProductService;
import com.OptimisticChemicalMakers.MapFood.dtos.ProductDto;
import com.OptimisticChemicalMakers.MapFood.models.Product;
import com.OptimisticChemicalMakers.MapFood.repositories.ProductRepository;

@CrossOrigin(origins="http://localhost:4200") // Temporary for the Angular App test
@RestController
@RequestMapping(value = "/api")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "/productByStore/{restaurantId}")
    public List<ProductDto> getProductByStore(@PathVariable String restaurantId) {
		return productService.getByRestaurantId(restaurantId);
    }
}

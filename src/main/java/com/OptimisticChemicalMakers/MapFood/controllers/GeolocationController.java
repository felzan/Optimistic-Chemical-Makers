package com.OptimisticChemicalMakers.MapFood.controllers;

import com.OptimisticChemicalMakers.MapFood.Services.GeolocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GeolocationController {

    @Autowired
    private GeolocationService geolocationService;

    // GET /distance
    // Return the distance between points
    @GetMapping(value = "/distance")
    public ResponseEntity<?> getDistance(

            @RequestParam("sLatitude") double sLatitude,
            @RequestParam("sLongitude") double sLongitude,
            @RequestParam("eLatitude") double eLatitude,
            @RequestParam("eLongitude") double eLongitude

    ) {
        return ResponseEntity.ok(geolocationService.getDistance(sLatitude, sLongitude, eLatitude, eLongitude));
    }

}

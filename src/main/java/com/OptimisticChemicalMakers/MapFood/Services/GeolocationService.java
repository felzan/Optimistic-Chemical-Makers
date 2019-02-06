package com.OptimisticChemicalMakers.MapFood.Services;

import com.OptimisticChemicalMakers.MapFood.models.Geolocation;
import org.springframework.stereotype.Service;

@Service
public class GeolocationService {

    public String getDistance(double sLatitude, double sLongitude, double eLatitude, double eLongitude) {

        double distance = Geolocation.haversinDistance(sLatitude, sLongitude, eLatitude, eLongitude);

        return Double.toString(distance);

    }

}
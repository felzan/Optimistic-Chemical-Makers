package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.*;

@Embeddable
@MappedSuperclass
public class Geolocation {

    // Static Properties

    private static final int EARTH_RADIUS = 6371; // Approx Earth radius in KM

    // Class Properties

    private double latitude;

    private double longitude;

    // Constructors
    public Geolocation() {
    }

    public Geolocation(double latitude, double longitude) {

        if (latitude < -90 || latitude > 90) {
            throw new NullPointerException("Latitude values must be between -90 and 90!");
        } else if (longitude < -180 || longitude > 180) {
            throw new NullPointerException("Longitude values must be between -180 and 180!");
        } else {
            this.latitude = latitude;
            this.longitude = longitude;
        }
    }

    // Static Methods

    public static double haversinDistance(double startingPointLatitude, double startingPointLongitude, double endingPointLatitude, double endingPointLongitude) {

        double dLat  = Math.toRadians((endingPointLatitude - startingPointLatitude));
        double dLong = Math.toRadians((endingPointLongitude - startingPointLongitude));

        startingPointLatitude = Math.toRadians(startingPointLatitude);
        endingPointLatitude   = Math.toRadians(endingPointLatitude);

        double a = haversin(dLat) + Math.cos(startingPointLatitude) * Math.cos(endingPointLatitude) * haversin(dLong);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return EARTH_RADIUS * c;
    }

    public static double haversin(double value) {
        return Math.pow(Math.sin(value / 2), 2);
    }

    // Get Methods

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    // Set Methods

    public void setGeolocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Class Methods

    public double distanceTo(Long latitude, Long longitude) {
        return this.distanceTo(new Geolocation(latitude, longitude));
    }

    public double distanceTo(Geolocation geolocation) {
        return this.haversinDistance(this.latitude, this.longitude, geolocation.getLatitude(), geolocation.getLongitude());
    }

}

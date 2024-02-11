package com.amazon.ata.lists;

import com.amazon.ata.resources.lists.prework.Destination;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing travel itinerary. The basic functionality it supports is to add, get or remove
 * a destination. Additionally, it allows a user to get a list of locations that are going to be visited
 * and get the total number of days that will be spent in trip.
 */
public class Itinerary {
    private List<Destination> destinations;
    private String location;
    private int daysAtLocation;
    private int totalDays;

    public Itinerary() {
        destinations = new ArrayList<>();
    }

    public Itinerary(String location, int daysAtLocation) {
        destinations = new ArrayList<>();
        this.location = location;
        this.daysAtLocation = daysAtLocation;
        this.totalDays += daysAtLocation;
    }

    /**
     * Add a new destination to the end of itinerary.
     *
     * @param destination destination to add to itinerary
     */
    public void addDestination(Destination destination) {
        // Implement the method here
        destinations.add(destination);
        totalDays += destination.getDaysAtLocation();
    }

    /**
     * Get the destination from itinerary based on its position.
     *
     * @param position position of destination to retrieve.
     * @return Destination at position.
     */
    public Destination getDestination(int position) {
        // Implement the method here
        return destinations.get(position);
    }

    /**
     * Remove a destination from itinerary based on its position.
     *
     * @param position position of destination to remove.
     * @return destination that was removed from itinerary.
     */
    public Destination removeDestination(int position) {
        // Implement the method here
        Destination removedDestination = destinations.remove(position);
        return removedDestination;
    }


    /**
     * Get list of locations (cities) in the order in which they
     * appear in the itinerary.
     *
     * @return full list of locations from itinerary.
     */
    public List<String> getListOfLocations() {
        // Implement the method here
        List<String> locations = new ArrayList<>();
        for (int i = 0; i < destinations.size(); i++) {
            locations.add(destinations.get(i).getLocation());
        }
        return locations;
    }

    /**
     * Get total number of days spent on the trip planned by the
     * itinerary.
     *
     * @return total number of days spent in all locations.
     */
    public int getTotalNumberOfDays() {
        // Implement the method here
        return totalDays;
    }

    /**
     * Get number of destinations contained in itinerary.
     *
     * @return number of destinations contained in itinerary.
     */
    public int getNumberOfDestinations() {
        // Implement the method here
        return destinations.size();
    }


    // Getters
    public List<Destination> getDestinations() {
        return destinations;
    }

    public String getLocation() {
        return location;
    }

    public int getDaysAtLocation() {
        return daysAtLocation;
    }

    public int getTotalDays() {
        return totalDays;
    }
}

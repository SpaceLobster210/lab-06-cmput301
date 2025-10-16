package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  This class holds the City type objects in a list
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This method adds a city to the cities list.
     * @param city is the City object which we want to add to the list.
     * @throws IllegalArgumentException if the city is already in the list.
     */
    public void add(City city) {
        if(cities.contains(city))
            throw new IllegalArgumentException();
        cities.add(city);
    }

    /**
     * This method sorts and returns the list of cities
     * @return a sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks to see if a City object is in the CityList
     * @param city is the city we are checking for
     * @return true if the list contains the city, false if not
     */
    public boolean hasCity(City city) {
        return getCities().contains(city);
    }

    /**
     * Checks to see if a City object is present in the list. If so, removes it.
     * @param city is the City object which we want to check for and remove
     * @throws IllegalArgumentException if the city is not in the list
     */
    public void delete(City city) {
        if (hasCity(city)) cities.remove(city);
        else throw new IllegalArgumentException();
    }

    /**
     * Counts the number of cities in the cities list
     * @return the number of City objects in cities
     */
    public int countCities() {
        return cities.size();
    }
}

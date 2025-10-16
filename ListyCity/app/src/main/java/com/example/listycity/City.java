package com.example.listycity;

/**
 *  This class represents a city
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructor for City class
     * @param city name of city
     * @param province name of province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Getter method for city name
     * @return name of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Getter method for province name
     * @return name of province
     */
    String getProvince(){
        return this.province;
    }

    /**
     * Compares a city to this.city
     * @param o the object to be compared.
     * @return 0, less than 1 or greater than 1 if two values are equal, a greater than b, or a less than b
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCity());
    }
}
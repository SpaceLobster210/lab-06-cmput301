package com.example.listycity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class CityListTest {
    public City mockCity() {
        return new City("Edmonton", "AB");
    }
    public CityList mockCityList() {
        CityList citylist = new CityList();
        citylist.add(mockCity());
        return citylist;
    }

    @Test
    void testAdd() {
        CityList citylist = mockCityList();
        assertEquals(1, citylist.getCities().size());
        City c = new City("Regina", "SK");
        citylist.add(c);
        assertEquals(2, citylist.getCities().size());
        assertTrue(citylist.getCities().contains(c));
    }

    @Test
    void testAddException() {
        CityList citylist = mockCityList();
        City city = new City("Yellowknife", "NT");
        citylist.add(city);
        assertThrows(IllegalArgumentException.class, () -> { citylist.add(city); });
    }


    @Test
    void testGetCities() {
        CityList citylist = mockCityList();
        assertEquals(0, mockCity().compareTo(citylist.getCities().get(0)));
        City c = new City("Charlottetown", "PEI");
        citylist.add(c);
        assertEquals(0, c.compareTo(citylist.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(citylist.getCities().get(1)));
    }

    @Test
    void testHasCity() {
        CityList citylist = mockCityList();
        City c = new City("Calgary", "AB");
        citylist.add(c);
        assertEquals(true, citylist.hasCity(c));
    }

    @Test
    void testDelete() {
        CityList citylist = mockCityList();
        City c = new City("Red Deer", "AB");
        citylist.add(c);
        citylist.delete(c);
        assertEquals(false, citylist.hasCity(c));
    }

    @Test
    void testDeleteException() {
        CityList citylist = mockCityList();
        City c = new City("Vancouver", "BC");
        assertThrows(IllegalArgumentException.class, () -> { citylist.delete(c); });
    }

    @Test
    void testCountCities() {
        CityList citylist = mockCityList();
        City c = new City("Red Deer", "AB");
        City d = new City("Vancouver", "BC");
        citylist.add(c);
        citylist.add(d);
        assertEquals(3, citylist.countCities());
        citylist.delete(d);
        assertEquals(2, citylist.countCities());
    }
}

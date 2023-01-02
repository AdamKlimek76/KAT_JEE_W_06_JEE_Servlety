package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.List;

public class Main03 {

    public static void main(String[] args) {
        List<City>cities=initialize();
        List<City>newCitiesList=firstSubList(cities, 1, 3);
        System.out.println(cities);
        System.out.println(newCitiesList);


    }

    public static List<City> initialize() {
        City city1 = new City("Warszawa", 2000000);
        City city2 = new City("Kraków", 700000);
        City city3 = new City("Bielsko-Biała", 150000);
        City city4 = new City("Katowice", 300000);
        City city5 = new City("Tychy", 100000);

        List<City> cities = new ArrayList<>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);

        return cities;
    }

    public static List<City> firstSubList(List<City> list, int start, int end ){
        List<City>firstCitieslist=new ArrayList<>();
        for (int i = start; i <= end; i++) {
            firstCitieslist.add(list.get(i));
        }

        return firstCitieslist;
    }

}

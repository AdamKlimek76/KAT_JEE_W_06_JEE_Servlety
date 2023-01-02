package pl.coderslab.setmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main03 {

    public static void main(String[] args) {
        List<Country> countries = initialize();
        Map<String, Country> countryMap = getMap(countries);

        for (Map.Entry<String, Country> entry : countryMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }


    }

    public static List<Country> initialize() {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Słowacja", "Bratysława"));
        countries.add(new Country("Czechy", "Praga"));
        countries.add(new Country("Polska", "Warszawa"));
        countries.add(new Country("Niemcy", "Berlin"));
        countries.add(new Country("Ukraina", "Kijów"));

        return countries;
    }

    public static Map<String, Country> getMap(List<Country> list) {
        Map<String, Country> countryMap = new HashMap<>();
        for (Country country : list) {
            countryMap.put(country.getCapital(), country);
        }

        return countryMap;
    }
}

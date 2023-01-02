package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main04 {

    public static void main(String[] args) {
        List<City> cities = Main03.initialize();
        List<City> reverseCitiesList = reverse(cities);
        System.out.println(cities);
        System.out.println(reverseCitiesList);
    }

    public static List<City> reverse(List<City> list) {

        List<City> reverseList = new ArrayList<>();
        ListIterator<City> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            reverseList.add(iterator.previous());
        }

        return reverseList;
    }
}

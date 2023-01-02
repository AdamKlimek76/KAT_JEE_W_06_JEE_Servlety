package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main02 {

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i <19 ; i++) {
            elements.add(i);
        }
        System.out.println("Normalnie");
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i));
        }

        removeDivider(elements, 3);

        System.out.println("Po usunięciu");
        for (Integer element : elements) {
            System.out.println(element);
        }

    }

    public static void removeDivider(List<Integer> list, int divider) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % divider == 0) {
                iterator.remove();
            }
        }
    }

}


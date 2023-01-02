package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main01 {

    public static void main(String[] args) {


        List<Integer>elements=new ArrayList<>();
        for (int i = 10; i <20 ; i++) {
            elements.add(i);
        }

        System.out.println("fori");
        for (int i = 0; i <elements.size(); i++) {
            System.out.println(elements.get(i));
        }

        System.out.println("while");
        Iterator<Integer>iterator=elements.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("foriterator");
        for(Iterator<Integer>iterator1=elements.iterator(); iterator1.hasNext(); ){
            System.out.println(iterator1.next());
        }

        System.out.println("foreach");
        for (Integer element : elements) {
            System.out.println(element);
        }
    }
}

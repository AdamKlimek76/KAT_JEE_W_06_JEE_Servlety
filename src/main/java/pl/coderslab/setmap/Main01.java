package pl.coderslab.setmap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main01 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<String>setList=new HashSet<>();
        String string=scanner.next();
        int count=0;
        while(!string.equals("exit")){
            setList.add(string);
            string = scanner.next();
            count++;
        }

        System.out.println("Podanych napisów " + count + " Rozmiar kolekcji " + setList.size());
        System.out.println(setList);
        String [] array=new String[setList.size()];
        System.out.println(setList.toString());
    }
}

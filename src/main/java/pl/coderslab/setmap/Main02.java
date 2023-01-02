package pl.coderslab.setmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Map<String, String> map = getMap();
        Scanner scanner=new Scanner(System.in);
        String answer="";
        int rightAnswersNumber=0;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            answer=scanner.next();
            if(answer.equals(entry.getValue())){
                rightAnswersNumber++;
            }

        }

        System.out.println("Prawidłowych odpowiedzi " + rightAnswersNumber);

    }

    public static Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("ciepło", "zimno");
        map.put("wysoko", "nisko");
        map.put("wolno", "szybko");
        map.put("ciemno", "jasno");
        map.put("głupio", "mądrze");

        return map;
    }
}

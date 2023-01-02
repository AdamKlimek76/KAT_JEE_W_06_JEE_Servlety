package pl.coderslab.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main03 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine().replaceAll(" +", "");

        while(!text.equals("quit")){
            boolean regex = Pattern.matches("([0-9]+[\\+\\*-/][0-9]+)([\\+\\*-/][0-9]+)+=[0-9]+", text);
            System.out.println(regex);
            text=scanner.nextLine();
        }

    }
}

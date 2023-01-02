package pl.coderslab.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main02 {

    public static void main(String[] args) {

        System.out.println(verifyPassword("aS123456.v"));

    }

    static boolean verifyPassword(String password) {
        boolean regex1 = Pattern.matches(".{10,15}", password);
        System.out.println(regex1);

        Pattern compiledPattern = Pattern.compile("[a-z]+");
        Matcher matcher = compiledPattern.matcher(password);
        boolean regex2 = matcher.find();
        System.out.println(regex2);

        Pattern compiledPattern2 = Pattern.compile("[A-Z]+");
        Matcher matcher2 = compiledPattern2.matcher(password);
        boolean regex3 = matcher2.find();
        System.out.println(regex3);

        Pattern compiledPattern3 = Pattern.compile("[A-Z]{2}|[a-z]{2}");
        Matcher matcher3 = compiledPattern3.matcher(password);
        boolean regex4 = !matcher3.find();

        System.out.println(regex4);


        return regex1 && regex2 && regex3 && regex4;
    }
}

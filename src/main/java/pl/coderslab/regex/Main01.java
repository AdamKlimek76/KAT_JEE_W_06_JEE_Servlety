package pl.coderslab.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main01 {

    public static void main(String[] args) {

        System.out.println(verifyEmail("a.klim@op.com.pl"));

    }

    static boolean verifyEmail(String email){

        Pattern compiledPattern = Pattern.compile("[A-Za-z1-9_]+[\\.A-Za-z1-9]*@[A-Za-z]+[\\.A-Za-z]*\\.[a-z]{2}");
        Matcher matcher = compiledPattern.matcher(email);

        return matcher.matches();

    }
}

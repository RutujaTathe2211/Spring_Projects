import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        //for adding pattern
        //. - is used to add one character in our string
        Pattern p=Pattern.compile("Rutuja.");

        //for matching particular pattern
        Matcher match=p.matcher("Rutujas");
       // Matcher match=p.matcher("R");

        if(match.matches()){
            System.out.println("Pattern match successfully .");
        }else{
            System.out.println("Invalid Input.");
        }


        //it will skip unmatched character and only returns matched ones.
       String mytext="Welcome To skill academy";
        //String mytext="123456";     //-------//d:used for numbers 0 to 9 instead od [0-9]
        Pattern p1=Pattern.compile("[//d a-z]+");
        Matcher matcher=p1.matcher(mytext);
        while(matcher.find()){
            System.out.println(mytext.substring(matcher.start(), matcher.end()));
        }
/*
quantifier:
x?: optional occur at one or not at all
x*: zero or more times x occur
x+: one or more times x occur
x{n}: x occur exactly n times
x{n,}: x occur n or more times
x{n,m}: x occur at least n times but not more than m times
| :used to either first pattern or second pattern is fine like abc|cde
 */

    }
}


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex2 {
    public static void main(String[] args) {
        //String input="Rutuja1";

        //options :
       // Pattern p=Pattern.compile("[A-Za-z]+[0-9]");
       // Pattern p=Pattern.compile("\\w+\\d");

        //match mob no
        String input="7066905814";
        //Pattern p=Pattern.compile("\\d{10}");

        //mob no starts with 987 or 10 digits
        Pattern p=Pattern.compile("[987]{1}\\d{9}");


        Matcher m=p.matcher(input);
        if(m.matches()){
            System.out.println("matched.");
        }else{
            System.out.println("invalid.");
        }
    }
}

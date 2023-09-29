import java.util.HashMap;
import java.util.Map;

public class map {
    /*
    -Map is an interface present in java.util package
    -do not inherit collection interface
    -syntax public interface map{}
    -store data in the form of key value pair
    -keys should be unique but value can be duplicate
    -we can store maximum null value in key but in value we can store multiple null value
    -not follow sorting and insertion oreder
    methods:put(),
     */
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put(1,"rutuja");
        map.put(3,"asmita");
        map.put(4,"Sakshi");
        System.out.println(map);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("rutuja"));
        //map.clear();
        System.out.println(map.replace(4,"Nikita"));
        System.out.println(map);

        //if we provide duplicate key then updated value is assign to key.
        System.out.println(map.put(3,"Ankita"));
        System.out.println(map);



    }
}

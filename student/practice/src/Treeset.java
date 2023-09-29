import java.util.HashSet;
import java.util.TreeSet;

public class Treeset {
    /*
    -****TreeSet*****: follow sorting order//implement direct navigable class
    -underlined data structor is balance tree
    -not follow insertion order
    -store only homogeneous element,not store duplicate element
    -not store null value
    -at backend compareTo() run for sorting purpose

    *****Hashset*******
       -hashset is implementation of set interface
       -underlined data structure is hashtable.
       -back up by :map
       -was introduced in 1.2 v

       Properties:
       -stored data in the form of hashcode values
       -duplicate value not possible
       -actual value in hashmap can stored in map and map cannot have  duplicate key so duplicate value are not allowed in hashset
        -not follow insertion order not follow sorting order//non synchronized
        */
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(20);
        set.add(80);
        set.add(2);
        set.add(40);
        set.add(89);

        System.out.println(set);




    }
}

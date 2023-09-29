import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class duplicate {
    public static void main(String[] args) {
        ArrayList <Integer> a=new ArrayList<>();
        a.add(0,20);
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(50);

//        System.out.println("array with duplicate"+a);
////
//        List b=(List)a.stream().distinct().collect(Collectors.toList());
//        System.out.println("array without duplicate"+b);
//       Iterator itr=a.iterator();
//        while(itr.hasNext()){
//            System.out.print(itr.next()+" ");
//        }
//        System.out.println("==================================");
//       // used to retrieve data from front and backside

        ListIterator l=a.listIterator();
        while(l.hasPrevious()){
            System.out.println(l.previous());
        }
       
    }
}

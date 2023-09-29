import java.util.Vector;

public class vector {
    /*
       -vector is legacy class that is present in list
       -legacy class that are re-modify
       -underlined data structor are growable and resizable array

       properties:-
       -index based data structor
       -it can store heterogeneous data type
       -allow duplicate element
       -multiple null value allow
       -vector follow insertion order and not follow sorting order
       -synchronized collection
       methods:
       addElement(),firstElement(),lastElement(),removeElement(),removeElementAt(),removeAllElement(),capacity():10
        */
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(500);
        v.add(10);
        v.add("rutuja");
        v.add(300);
        v.add('d');
        v.add(8.56);
        v.addElement(800);
        v.add(500);
        v.add(10);
        v.add("rutuja");
        v.add(300);
        System.out.println(v);

        //initial capacity 10:if elements is greater than the initial capacity then the next capacity is (initial capacity*2)
        System.out.println("Initial capacity: "+v.capacity());
        System.out.println("First element: "+ v.firstElement());
        System.out.println("remove: "+v.remove("rutuja"));
        System.out.println("after remove vector is :"+ v);

    }
}

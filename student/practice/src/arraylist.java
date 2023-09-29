import java.util.ArrayList;

public class arraylist {
    /*
    -insertion and deletion is difficult.
    -store element in contiguous memory location
    -underlined data structor of arraylist is growable and resizable
    -good for retrival purpose

     */
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(50);
        list.add(69);
        list.add(80);
        list.add(20);
        list.add(null);

        ArrayList l=new ArrayList<>();
        l.add(20);
        l.add(100);
        l.add(900);
        l.add(50);

         System.out.println(list.set(2,20));
        System.out.println(list);

        //remove the common element from first list and print other element

        System.out.println(list.removeAll(l));
        System.out.println(list);



        //check whether all element present in second list or not
        System.out.println(list.containsAll(l));
        System.out.println(list);

        //get particular element
        System.out.println(list.get(1));
        System.out.println(list);

        //add all element of list l in list collection
        list.addAll(l);
        System.out.println(list);

    }
}

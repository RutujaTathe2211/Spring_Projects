import java.util.LinkedList;
/*
       -store duplicate element
       -store duplicate null value
       -follow insertion order
       -not follow sorting order
       -travers in forward and backward direction
       -insertion and deletion is easy
       -not contain synchorized method

       method:add(),addAll(),remove(),removeAll(),AddFirst(),addLast(),contains(),getFirst(),getLast(),removeFirst(),removeLast()
       containsAll()
       -implements deque and circularLinkList
        */
public class linkedlist {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(1);
        list.add("Rutuja");
        list.add('d');
        list.add(3.14);
        list.add(89.00);

        list.addFirst(111);
        list.remove("Rutuja");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list.removeFirst());
        System.out.println(list);




    }
}

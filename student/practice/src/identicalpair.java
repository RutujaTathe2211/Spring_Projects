import java.util.*;

public class identicalpair {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter size1:");
        int size1=sc.nextInt();
        String a1[]=new String[size1];
        System.out.println("enter size2:");
        int size2=sc.nextInt();
        String a2[]=new String [size2];
        System.out.println("enter array1:");
        for(int i=0;i<size1;i++){
            a1[i]=sc.next();
        }
        System.out.println("enter array2");
        for(int i=0;i<size2;i++){
            a2[i]=sc.next();
        }
        System.out.println("array1");
        for(int i=0;i<size1;i++){
            System.out.print(a1[i]+" ");
        }
        System.out.println("array2");
        for(int i=0;i<size2;i++){
            System.out.println(a2[i]+" ");
        }
        List <String>l1=new ArrayList<>();
        List<String>l2=new ArrayList<>();
        for(int i=0;i<size1;i++){
            l1.add(a1[i]);
        }
        for(int i=0;i<size2;i++){
            l2.add(a2[i]);
        }
        l1.addAll(l2);
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:l1){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else {
                map.put(s,1);
            }

        }
        System.out.println(map);

    }

}

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter the radius:");
        int r=sc.nextInt();
        double area=3.14*r*r;
        double cir=6.28*r;
        System.out.println("area of circle is:"+area);
        System.out.println("perimeter is:"+cir);
    }
}

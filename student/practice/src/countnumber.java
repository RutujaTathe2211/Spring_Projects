public class countnumber {
    public static void main(String[] args) {
        int number=200;
        int count=0;
        while(number>0){
            number=number/10;
            count++;
        }
        System.out.println("number of digits is:"+count);
    }
}

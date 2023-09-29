public class pallindrome {
    public static void main(String[] args) {
        int num;
        for(int i=11;i<1000;i++){
            num=i;int rev=0;
            while(num>0){
                int digit=num%10;
                rev=rev*10+digit;
                num=num/10;
            }
            if(rev==i){
                System.out.println(i);
            }
        }

    }
}

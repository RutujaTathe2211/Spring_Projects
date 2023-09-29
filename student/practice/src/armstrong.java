public class armstrong {
    public static void main(String[] args) {

        System.out.println("armstrong:");
        for(int num=2;num<1000;num++){
            int sum=0;int i=num;
            while(i>0){
                int rev=i%10;
                sum=sum+(rev*rev*rev);
                i=i/10;
            }
            if(sum==num)
            {
                System.out.println(num);
            }
        }

    }
}

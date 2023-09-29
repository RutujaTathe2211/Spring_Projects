public class primenumber {
    public static void main(String[] args) {
        System.out.println("prime numebr");
        for(int i=2;i<1000;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }

    }
}

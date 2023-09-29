public class charcount {
    public static void main(String[] args)
    {
        String s="Rutuja";
        s.replace(" ","");
        char a[]=s.toCharArray();
        int count;
        for(int i=0;i<a.length;i++){
            count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]&&a[i]!='0'){
                    count++;
                    a[j]='0';
                }
            }
            if(a[i]!='0')
            System.out.println(a[i]+"="+count);
        }
    }
}

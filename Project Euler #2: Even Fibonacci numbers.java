import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int x = 0; x < t; x++){
            long n = in.nextLong();
            long a=0,b=1,s=0,c=0;
            while((a+b)<=n)
            {
                c=a+b;
                a=b;
                b=c;
                if(c%2==0)
                {
                    s=s+c;
                }
            }
            System.out.println(s);
        }
    }
}

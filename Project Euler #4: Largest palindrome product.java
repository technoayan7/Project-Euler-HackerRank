import java.util.*;
public class Solution {
    
    public static boolean isPalindrome(long number){
        long sum=0,num=number;
        while(num!=0)
        {
            long d=num%10;
            sum=sum*10+d;
            num=num/10;
        }
        if(sum==number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long arr[] = new long[t];
        for(int a = 0; a < t; a++){
            long n = in.nextInt();
            long m,p,l=0;
            for(int i=100;i<1000;i++)
            {
                for(int j=101;j<999;j++)
                {
                    m=i*j;
                    if(isPalindrome(m))
                    {
                        if(m>l && m<n)
                        l=m;
                    }
                }
            }
        arr[a]=l;
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

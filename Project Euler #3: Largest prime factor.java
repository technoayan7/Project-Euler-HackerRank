import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long l=0;
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            for(int j=2;j<=Math.sqrt(n);j++){
                while(n%j==0 && n!=j){
                    n=n/j;
                }
                l=n;
            }
            System.out.println(l);
        }
    }
}

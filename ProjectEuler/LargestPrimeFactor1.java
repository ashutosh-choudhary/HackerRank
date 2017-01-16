import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0){            
            long n = in.nextLong();
            while(n>1 && n%2==0) n /= 2;
            if(n <= 1) System.out.println(2);
            else{
            long prime = 1;
                while(n>1 && prime <= (long)Math.ceil(Math.sqrt(n))){
                    prime += 2;
                    while(n%prime==0) n /= prime;                        
                }
            if(n==1) System.out.println(prime);                
            else System.out.println(n);                
            }
            t--;
        }
    }
}

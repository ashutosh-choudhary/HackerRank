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
            long prime = 3;
                while(n>1){
                    while(n%prime!=0){
                        prime += 2;
                        while(!isPrime(prime)) prime += 2;
                    }
                    n /= prime;
                }
            System.out.println(prime);                
            }
            t--;
        }
    }
    
    private static boolean isPrime(long n){
        HashSet<Long> set = new HashSet<Long>();
        set.add((long) 2); set.add((long) 3); set.add((long) 5); set.add((long) 7); 
        set.add((long) 11); set.add((long) 13);        
        set.add((long) 17); set.add((long) 19); set.add((long) 23); set.add((long) 29);
        set.add((long) 31); set.add((long) 37); set.add((long) 41); set.add((long) 43);
        set.add((long) 47); set.add((long) 53); set.add((long) 59); set.add((long) 61);
        set.add((long) 67); set.add((long) 71); set.add((long) 73); set.add((long) 79);        
        set.add((long) 83); set.add((long) 89); set.add((long) 91);  
        if(n<101 && set.contains(n)) return true;
        if(n%2 == 0) return false;
        for(long i=3; i <= (long)Math.ceil(Math.sqrt(n)); i+=2){
            if(n%i == 0) return false;
        }
        return true;
    }
}

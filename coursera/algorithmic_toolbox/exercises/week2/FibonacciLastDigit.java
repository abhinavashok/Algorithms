import java.util.*;
import java.math.BigInteger;

public class FibonacciLastDigit {
    /**
     * 0,1,1,2,3,5,8,13,21,34,55,8
     * 
     * 33
     * 
     */
    private static int getFibonacciLastDigit(int n) {
        if (n == 1)
          return 1;
        if(n == 0)
          return 0;
    
        int f= 0;
        int s = 1;
        int nth = Integer.MIN_VALUE;
        while(n>1){
          nth = (f+s)%10;
          f = s;
          s = nth;
          n--;
        } 
        return nth;
      }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getFibonacciLastDigit(n));
    }
}


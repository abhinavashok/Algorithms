import java.util.*;

public class FibonacciSumLastDigit {
    /**
     * 0,1,1,2,3,5,8,13,21,34,55,8
     * 
     * 0,1,2,4,7,2,0,3,4,8,3
     * 
     * 33
     * 
     */
    private static int getFibonacciSumLastDigit(long n) {
        if (n == 1)
          return 1;
        if(n == 0)
          return 0;
    
        int f= 0;
        int s = 1;
        int nth = Integer.MIN_VALUE;
        int sum =1;
        while(n>1){
          nth = (f+s)%10;
          f = s;
          s = nth;
          sum = (sum+nth)%10;
          n--;
        } 
        return sum;
      }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(getFibonacciSumLastDigit(n));
        scanner.close();
    }
}


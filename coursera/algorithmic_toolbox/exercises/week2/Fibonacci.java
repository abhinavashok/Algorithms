import java.util.Scanner;
import java.math.BigInteger;

public class Fibonacci {
  private static BigInteger calc_fib(int n) {
    if (n == 1)
      return BigInteger.ONE;
    if(n == 0)
      return BigInteger.ZERO;

    BigInteger first = BigInteger.ZERO;
    BigInteger second = BigInteger.ONE;
    BigInteger nth = null;
    while(n>1){
      nth = first.add(second);
      first = second;
      second = nth;
      n--;
    } 

    return nth.mod(new BigInteger(10));
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
    in.close();
  }
}

import java.util.*;
import java.math.BigInteger;

public class LCM {
  private static BigInteger lcm(int a, int b) {
    int gcd = gcd(a,b);
    BigInteger f = BigInteger.valueOf((long)a);
    BigInteger s = BigInteger.valueOf((long)b);
    BigInteger d = BigInteger.valueOf((long)gcd);
    return  (f.multiply(s)).divide(d);
  }

  private static int gcd(int a,int b){
    int rem = Integer.MIN_VALUE;
      while(rem!=0){
        rem= a%b;
        a=b;
        b=rem;
      }
      return a;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm(a, b));
  }
}

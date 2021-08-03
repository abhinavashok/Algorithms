import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class MaxPairwiseProduct {
    static BigInteger getMaxPairwiseProduct(int[] numbers) {
        long max_product = 0;
        int n = numbers.length;
        int firstMax=Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE;
        int j=0;
        for (int i = 0; i < n; i++) {
            if(numbers[i]>firstMax){
                firstMax = numbers[i];
                j=i;
            }
        }
        for (int i = 0; i < n; i++) {
            if(i!=j && numbers[i]>=secondMax){
                secondMax = numbers[i];
            }
        }
        BigInteger first = new BigInteger(Integer.toString(firstMax));
        BigInteger second = new BigInteger(Integer.toString(secondMax));
        return first.multiply(second);
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}

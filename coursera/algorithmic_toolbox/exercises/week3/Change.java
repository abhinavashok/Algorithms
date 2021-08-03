import java.util.Scanner;

public class Change {

    private static int getChange(int m) {
        int c10=0,c5=0;
        if(m>=10){
            c10= m/10;
            m=m%10;
        }
        if(m>=5){
            c5=m/5;
            m=m%5;  
        }
        return c10+c5+m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));
        scanner.close();

    }
}


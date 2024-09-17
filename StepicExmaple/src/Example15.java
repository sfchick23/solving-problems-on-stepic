import java.math.BigInteger;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer integer = sc.nextInt();
        if (integer == 1) {
            System.out.println("NO");;
        }else {
            BigInteger bigInteger = BigInteger.valueOf(integer);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
            System.out.println((probablePrime ? "YES" : "NO"));
        }
    }
}

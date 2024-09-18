import java.math.BigInteger;
import java.util.Scanner;

//TODO дорешать 
public class Example20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        isPrime(n);

    }


    static boolean isPrime(int n) {
        if (n <= 0) {
            if (n == 1) {
                return false;

            } else {
                BigInteger bigInteger = BigInteger.valueOf(n);
                boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(n));
                return (probablePrime ? true : false);
            }
        }else return false;

    }
}
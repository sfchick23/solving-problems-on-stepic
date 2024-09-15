import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = 0;

        for (int i = 1; i < a+1; i++) {
            if (a % i == 0) {
                res += i;
            }
        }

        System.out.println(res);
    }
}

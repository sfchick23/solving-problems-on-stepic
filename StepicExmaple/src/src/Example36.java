import java.util.Scanner;

public class Example36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String res = s.replace(";", ".,");

        System.out.println(res);
    }
}

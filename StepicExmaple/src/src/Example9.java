import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            list.add(b);
        }
        Collections.sort(list);
        System.out.println(list.get(0));

    }
}

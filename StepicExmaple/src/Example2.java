import java.util.Scanner;
//TODO я хуй знает как ето делать мб я в будущем решу а так мне похуй
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int[] arr = {a, b, c, d, e};
        int res = 0;
        for (int i = 0; i < arr.length; i++) {

            res = Math.max(arr[i], arr[i+1]);
        }

        System.out.println(res);


    }
}

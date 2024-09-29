import java.util.Scanner;

public class Example48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();


        if (height > 0 && width > 0) {
            for (int i = 1; i <= height; i++) {

                for (int j = 1; j <= width; j++) {

                    if (i == 1 || i == height || j == 1 || j == width) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }else System.out.println("ERROR");
    }
}
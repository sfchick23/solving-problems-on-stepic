import java.util.Locale;
import java.util.Scanner;

public class Exampale3 {
    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner scan = new Scanner(System.in);
//        int h = scan.nextInt();
//        float f = scan.nextFloat();
//        if (h <= 0 || f <= 0) System.out.println("ERROR");
//        else {
//            if (h <= 20) System.out.printf("%.2f", h * f);
//            if (h <= 40) System.out.printf("%.2f", 20 * f + (h - 20) * f * 1.5);
//            else System.out.printf("%.2f", 20 * f + 20 * f * 1.5 + (h - 40) * f * 2);
//        }

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        float t = sc.nextFloat();

        if (h <= 0 || t <= 0) System.out.println("ERROR");
        else {
            if (h <= 20){
                System.out.printf("%.2f", h * t);
            }else if (h <= 40){
                System.out.printf("%.2f", 20 * t + (h - 20) * t * 1.5);
            }else System.out.printf("%.2f", 20 * t + 20 * t * 1.5 + (h - 40) * t * 2);
        }


    }

}

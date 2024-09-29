import java.util.Scanner;
public class Example22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        System.out.printf("%.2f %.2f\n", average(a, b), average(a, b, c));
        System.out.printf("%.2f %.2f\n", average(x, y),average(x, y, z));
    }

    public static double average(double x, double y){
        double q = (x+y)/2;
        return q;
    }
    public static double average(double x, double y, double z){
        double q = (x+y+z)/3;
        return q;
    }
}

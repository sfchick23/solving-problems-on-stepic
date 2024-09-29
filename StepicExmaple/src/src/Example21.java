import java.util.Scanner;

public class Example21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b =sc.nextDouble() ;
        if (a == 1){
            square(a,b);
        }else {
            double c =sc.nextDouble();
            square(a,b,c);
        }
    }
    static void square(int a, double b, double c ){
        double q =b*c;
        System.out.printf("%.2f",q);
    }
    static void square(int a, double b){

        double q = Math.pow(b,2);
        System.out.printf("%.2f",q);
    }
}

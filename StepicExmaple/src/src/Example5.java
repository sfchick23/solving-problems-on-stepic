import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAXOILPLANE = 300;
        int ab = sc.nextInt();
        int bc = sc.nextInt();
        int weight = sc.nextInt();
        int result = 0;

        if (weight <= 500) {
            result = ab + bc - MAXOILPLANE;
            if ((result < MAXOILPLANE)) {
                if (result < 0) {
                    System.out.println("ERROR");
                } else System.out.println(result + ".00");
            }else System.out.println(0 + ".00");
        }else if (weight > 500 && weight <= 1000) {
            result = MAXOILPLANE - (ab + bc) ;
            if (result < 0) {
                System.out.println("ERROR");
            }else {
                result = (ab + bc) / 4;
                System.out.println(result + ".00");
            }
        }else if (weight > 1000 && weight <= 1500) {
            result = MAXOILPLANE - (ab + bc);
            if (result < 0) {
                System.out.println("ERROR");
            }else{
                result = (ab + bc) / 7;
                System.out.println(result + ".00");
            }
        }else if (weight > 1500 && weight <= 2000) {
            result = MAXOILPLANE - (ab + bc);
            if (result < 0) {
                System.out.println("ERROR");
            }else{
                result = (ab + bc) / 9;
                System.out.println(result + ".00");
            }
        }else System.out.println("ERROR");



    }
}

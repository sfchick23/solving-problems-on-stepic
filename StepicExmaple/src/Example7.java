import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();

        switch (week){
            case 1 -> System.out.println("Working day");
            case 2 -> System.out.println("Working day");
            case 3-> System.out.println("Working day");
            case 4 -> System.out.println("Working day");
            case 5 -> System.out.println("Working day");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("ERROR");
        }
    }
}

import java.util.Scanner;

public class Example39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(delCom(str));
    }

    private static String delCom(String str) {
        if (str.endsWith(".com")){
            str = str.substring(0, str.length()-4);
        }
        return str;
    }
}

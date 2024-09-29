import java.util.Scanner;

public class Example38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        if (isValidGmail(email)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    // Метод для проверки, является ли строка корректным адресом Gmail
    public static boolean isValidGmail(String email) {
        if (email.equals("@gmail.com")) {
            return false;
        }
        int atIndex = email.indexOf('@');
        if (atIndex != email.lastIndexOf('@')) {
            return false;
        }
        if (!email.endsWith("@gmail.com")) {
            return false;
        }

        return true;
    }
}
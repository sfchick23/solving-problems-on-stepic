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
        // Проверяем, что строка заканчивается на "@gmail.com"
        if (!email.endsWith("@gmail.com")) {
            return false;
        }
        if (email.length() < 10) {
            return false;
        }
        // Проверяем, что '@' встречается только один раз
        int atIndex = email.indexOf('@');
        if (atIndex != email.lastIndexOf('@')) {
            return false;
        }

        return true;
    }
}
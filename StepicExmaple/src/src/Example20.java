import java.math.BigInteger;
import java.util.Scanner;


public class Example20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        String str = sc.next();
        char symbol = str.charAt(0);
        printTriangle(width, symbol);

    }

    public static void printTriangle(int width, char symbol) {
        int height = (width + 1) / 2; // Высота треугольника, для нечетных и четных ширин

        // Печать треугольника строка за строкой
        for (int i = 1; i <= height; i++) {
            // Печать пробелов перед символами
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            // Печать символов
            for (int j = 0; j < 2 * i - 1; j++) { // Количество символов
                System.out.print(symbol);
            }
            // Переход на следующую строку
            System.out.println();
        }
    }
}
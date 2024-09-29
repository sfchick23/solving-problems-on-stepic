import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод диапазона
        System.out.println("Введите два целых числа (границы диапазона) через пробел:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Определение минимальной и максимальной границы диапазона
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        // Переменная для хранения произведения, используем тип double
        double product = 1;

        // Цикл while для расчета произведения чисел в диапазоне
        int i = start;
        while (i <= end) {
            product *= i;
            i++;
        }

        // Вывод результата без форматирования
        System.out.println(product);
    }
}

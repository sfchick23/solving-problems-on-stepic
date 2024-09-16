import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод ширины треугольника
        int width = scanner.nextInt();

        // Проверка на корректность данных
        if (width <= 0) {
            System.out.println("ERROR");
        } else {
            // Рисуем треугольник
            for (int i = 0; i < (width + 1) / 2; i++) {
                // Выводим пробелы
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                // Выводим звездочки
                for (int j = 0; j < width - 2 * i; j++) {
                    System.out.print("*");
                }
                // Перевод строки
                System.out.println();
            }
        }
    }
}



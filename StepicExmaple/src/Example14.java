import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            // Выводим первое число без табуляции
            System.out.printf("%d", i);

            for (int j = 2; j <= k; j++) {
                // Выводим табуляцию перед каждым числом, начиная со второго
                System.out.printf("\t%d", j * i);
            }

            // Переход на новую строку после завершения вывода строки
            System.out.println();
        }
    }
}

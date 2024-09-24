import java.util.Scanner;

public class Example37 {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода
        Scanner scanner = new Scanner(System.in);

        // Создаем строку для хранения результата
        StringBuilder codeWord = new StringBuilder();


        for (int i = 0; i < 3; i++) {
            String input = scanner.nextLine();

            // Извлекаем части кодового слова между символами ';'
            int start = input.indexOf(';');
            while (start != -1) {
                int end = input.indexOf(';', start + 1);
                if (end != -1) {
                    codeWord.append(input, start + 1, end);
                    start = input.indexOf(';', end + 1);
                } else {
                    break;
                }
            }
        }

        // Выводим собранное кодовое слово
        System.out.println(codeWord.toString());
    }
}

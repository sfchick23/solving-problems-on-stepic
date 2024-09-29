import java.util.Scanner;

public class Example45 {
    public static void main(String[] args) {
        // Вводим строку с клавиатуры
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Строка для хранения выражения суммы цифр
        StringBuilder expression = new StringBuilder();
        int sum = 0;
        boolean hasDigits = false;  // Флаг для проверки наличия цифр

        // Проходим по каждому символу строки
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Если символ является цифрой
            if (Character.isDigit(ch)) {
                int digit = ch - '0';  // Преобразуем символ в число
                sum += digit;  // Добавляем цифру к сумме

                // Добавляем цифру в выражение
                if (hasDigits) {
                    expression.append("+");
                }
                expression.append(digit);

                hasDigits = true;  // Обновляем флаг, так как найдена хотя бы одна цифра
            }
        }

        // Если цифры найдены, выводим выражение
        if (hasDigits) {
            expression.append("=").append(sum);
            System.out.println(expression.toString());
        } else {
            // Если цифр нет, выводим "ERROR"
            System.out.println("ERROR");
        }
    }
}

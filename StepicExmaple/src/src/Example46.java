import java.util.Scanner;

public class Example46 {
    public static String removeWord(String text, String wordToRemove) {
        // Регулярное выражение для поиска точного совпадения с контрольным словом
        String regex = "\\b" + wordToRemove + "\\b";
        // Удаляем все появления контрольного слова
        text = text.replaceAll(regex, "");
        // Удаляем лишние пробелы между словами и в начале/конце строки
        text = text.trim().replaceAll("\\s+", " ");
        return text;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ввод текста
        String text = sc.nextLine();
        // Ввод контрольного слова
        String wordToRemove = sc.nextLine();

        // Удаляем контрольное слово из текста и лишние пробелы
        String result = removeWord(text, wordToRemove);

        // Выводим результат
        System.out.println(result);
    }
}

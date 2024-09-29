import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите расстояние от А до В (км): ");
        double distanceAB = scanner.nextDouble();

        System.out.print("Введите расстояние от В до С (км): ");
        double distanceBC = scanner.nextDouble();

        System.out.print("Введите вес груза (кг): ");
        double weight = scanner.nextDouble();

        // Проверка допустимого веса
        if (weight > 2000) {
            System.out.println("ERROR");
            return;
        }

        // Вычисление расхода топлива на 1 км в зависимости от веса
        double fuelConsumption = getFuelConsumptionPerKm(weight);

        // Проверка на возможность преодолеть расстояние от А до В
        double fuelNeededAB = distanceAB * fuelConsumption;
        if (fuelNeededAB > 300) {
            System.out.println("ERROR");
            return;
        }

        // Проверка на возможность преодолеть расстояние от В до С
        double fuelNeededBC = distanceBC * fuelConsumption;

        // Сколько топлива останется после полета от А до В
        double remainingFuelAfterAB = 300 - fuelNeededAB;

        // Если оставшегося топлива достаточно для полета от В до С
        if (remainingFuelAfterAB >= fuelNeededBC) {
            System.out.printf("%.2f\n", 0.0);
        } else {
            // Вычисление необходимого количества дозаправки
            double fuelToRefuel = fuelNeededBC - remainingFuelAfterAB;

            // Проверка, если требуемое количество топлива превышает емкость бака
            if (fuelToRefuel > 300) {
                System.out.println("ERROR");
            } else {
                System.out.printf("%.2f\n", fuelToRefuel);
            }
        }
    }

    // Метод для определения расхода топлива на 1 км в зависимости от веса
    public static double getFuelConsumptionPerKm(double weight) {
        if (weight <= 500) {
            return 1.0;
        } else if (weight <= 1000) {
            return 4.0;
        } else if (weight <= 1500) {
            return 7.0;
        } else if (weight <= 2000) {
            return 9.0;
        }
        return 0; // хотя вес уже проверен выше
    }
}

